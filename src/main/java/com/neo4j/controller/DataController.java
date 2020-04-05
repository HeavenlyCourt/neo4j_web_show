package com.neo4j.controller;

import com.neo4j.domain.DataEntity;
import com.neo4j.services.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

/**
 * @Authror SPL
 * @Description TODO
 * @Date 2020/2/15
 */

@RestController
@RequestMapping("/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/entities")
    public Collection<DataEntity> findDataEntities(@RequestParam String name){
        return dataService.findByTitleLike(name);
    }

    @GetMapping("/graph")
    public Map<String,Object> graph(@RequestParam(value = "limit",required = false)Integer limit){
        return dataService.graph(limit == null ? 64 : limit);
    }
}
