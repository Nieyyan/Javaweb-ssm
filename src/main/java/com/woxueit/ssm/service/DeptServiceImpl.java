package com.woxueit.ssm.service;

import com.woxueit.ssm.mapper.DeptMapper;
import com.woxueit.ssm.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public int addDept(Dept dept) {
        int i = deptMapper.addDept(dept);
        return i;
    }
}
