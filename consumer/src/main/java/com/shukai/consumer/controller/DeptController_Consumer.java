package com.shukai.consumer.controller;

import com.shukai.api.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
    private static String URL_PREFIX="http://PROVIDER";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/dept/get/{deptno}")
    public ResponseEntity<Dept> get(@PathVariable("deptno")Long deptno){
        return restTemplate.getForEntity(URL_PREFIX+"/dept/get/"+deptno,Dept.class);
    }
    @GetMapping("/dept/list")
    public List list(){
        return restTemplate.getForObject(URL_PREFIX+"/dept/list",List.class);
    }
}
