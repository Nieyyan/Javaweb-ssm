package com.woxueit.ssm.mapper;

import com.woxueit.ssm.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {

    @Select("select * from dept")
    public List<Dept> findAll();

    @Insert("insert  into `dept`(`dept_name`,`create_time`,`update_time`) values (#{deptName}, #{createTime}, #{updateTime})")
    public int addDept(Dept dept);
}
