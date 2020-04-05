package com.neo4j.services;

import com.neo4j.domain.DataEntity;
import com.neo4j.domain.Movie;
import com.neo4j.domain.Role;
import com.neo4j.repositories.DataEntityRepository;
import org.neo4j.cypher.internal.frontend.v2_3.ast.functions.Str;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Authror SPL
 * @Description TODO
 * @Date 2020/2/15
 */

@Service
public class DataService {
    private final static Logger LOG = LoggerFactory.getLogger(DataService.class);

    private final DataEntityRepository dataEntityRepository;


    public DataService(DataEntityRepository dataEntityRepository) {
        this.dataEntityRepository = dataEntityRepository;
    }

    @Transactional(readOnly = true)
    public DataEntity findByTitle(String title) {
        DataEntity result = dataEntityRepository.findByName(title);
        return result;
    }

    @Transactional(readOnly = true)
    public Collection<DataEntity> findByTitleLike(String title) {
        Collection<DataEntity> result = dataEntityRepository.findByNameLike(title);
        return result;
    }



    private Map<String, Object> toD3Format(Collection<DataEntity> dataEntities) {
        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        Iterator<DataEntity> result = dataEntities.iterator();
        while (result.hasNext()) {
            DataEntity dataEntity = result.next();
            nodes.add(map("name", dataEntity.getName(),
                    "石家庄市",dataEntity.get石家庄市(),
                    "唐山市",dataEntity.get唐山市(),
                    "邯郸市",dataEntity.get邯郸市(),
                    "张家口市",dataEntity.get张家口市(),
                    "保定市", dataEntity.get保定市(),
                    "沧州市", dataEntity.get沧州市(),
                    "秦皇岛市", dataEntity.get秦皇岛市(),
                    "邢台市", dataEntity.get邢台市(),
                    "承德市", dataEntity.get承德市(),
                    "衡水市",dataEntity.get衡水市()
                    ));
        }
        return map("nodes",nodes,"links",rels);
    }

    private Map<String, Object> map(String key1, Object value1, String key2, Object value2,
                                    String key3,Object value3,String key4,Object value4,
                                    String key5,Object value5,String key6,Object value6,
                                    String key7,Object value7,String key8,Object value8,
                                    String key9,Object value9,String key10,Object value10,
                                    String key11,Object value11
                                    ) {
        Map<String, Object> result = new HashMap<String, Object>(11);
        result.put(key1, value1);
        result.put(key2, value2);
        result.put(key3, value3);
        result.put(key4, value4);
        result.put(key5, value5);
        result.put(key6, value6);
        result.put(key7, value7);
        result.put(key8, value8);
        result.put(key9, value9);
        result.put(key10, value10);
        result.put(key11, value11);

        return result;
    }

    private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
        Map<String, Object> result = new HashMap<String, Object>(2);
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }

    @Transactional(readOnly = true)
    public Map<String, Object> graph(int limit) {
        Collection<DataEntity> result = dataEntityRepository.graph(limit);
        return toD3Format(result);
    }
    
}
