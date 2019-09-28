package com.shukai.api.service;

import com.shukai.api.bean.Dept;

import java.util.List;

public interface DeptService {
    public Dept findById(Long deptno);
    public List<Dept> findAll();
}
