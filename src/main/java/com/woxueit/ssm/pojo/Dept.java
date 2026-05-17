package com.woxueit.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Dept {
    private Integer id;
    private String deptName;
    //防止：前端提交日期字符串，后端SpringMVC无法把字符串自动转换为日期格式数据的问题
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    //防止：前端提交日期字符串，后端SpringMVC无法把字符串自动转换为日期格式数据的问题
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
//set、get----alt+insert，然后选中Getter and Setter，然后选中全部属性，按回车
}