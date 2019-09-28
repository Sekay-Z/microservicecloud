package com.shukai.provider.service;

import com.shukai.api.bean.Dept;
import com.shukai.api.service.DeptService;
import com.shukai.provider.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public Dept findById(Long deptno) {
        return deptDao.findById(deptno);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
