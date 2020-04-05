package com.neo4j.repositories;

import com.neo4j.domain.DataEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * @Authror SPL
 * @Description TODO
 * @Date 2020/2/15
 */
public interface DataEntityRepository  extends Neo4jRepository<DataEntity,Long> {

    DataEntity findByName(@Param("name") String name);

    Collection<DataEntity> findByNameLike(@Param("name") String name);

    @Query("MATCH (m:mydata) RETURN m  LIMIT {limit}")
    Collection<DataEntity> graph(@Param("limit") int limit);
    
}
