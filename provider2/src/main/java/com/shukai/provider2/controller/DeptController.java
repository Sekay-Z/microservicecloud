package com.shukai.provider2.controller;

import com.shukai.api.bean.Dept;
import com.shukai.api.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/get/{deptno}")
    public Dept get(@PathVariable("deptno")Long deptno){
        return deptService.findById(deptno);
    }
    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.findAll();
    }
}
