package com.woxueit.ssm.controller;

import com.woxueit.ssm.pojo.Dept;
import com.woxueit.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/list")
    public Object findAll(){
        List<Dept> all = deptService.findAll();
        return all;
    }

    // 1. 新增数据，应该使用POST
    // 2. 获取数据，应该使用GET
    // 3. 修改数据，应该使用PUT
    // 4. 删除数据，应该使用DELETE
    @PostMapping("/add")
    public Object addDept(Dept dept){
        int i = deptService.addDept(dept);
        Map<String, Object> map = new HashMap<>();
        if(i>0){
            map.put("code", "200");
            map.put("message", "success");
        }else{
            map.put("code", "500");
            map.put("message", "fail");
        }
        return map;
    }

    //注意事项：
    // 1. 前端提交的应该是一个JSON格式的数据
    // 2. 形式参数前必须加@RequestBody注解
    // 3. 传入的JSON数据中key和value中的key要与传入参数的实体的属性名一致
    @PostMapping("/add2")
    public Object addDept2(@ RequestBody Dept dept){
        int i = deptService.addDept(dept);
        Map<String, Object> map = new HashMap<String, Object>();
        if (i > 0){
            map.put("code", 200);
            map.put("message", "success");
        }else{
            map.put("code", 500);
            map.put("message", "fail");
        }
        return map;
    }

}
