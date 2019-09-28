package com.shukai.provider2.dao;

import com.shukai.api.bean.Dept;

import java.util.List;

public interface DeptDao {
    public Dept findById(Long deptno);
    public List<Dept> findAll();
}
