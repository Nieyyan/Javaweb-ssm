package com.woxueit.ssm.service;

import com.woxueit.ssm.pojo.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> findAll();

    public int addDept(Dept dept);
}
