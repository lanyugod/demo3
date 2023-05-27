package com.example.demo3.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo3.pojo.Student;
import com.example.demo3.service.StudenServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class StudentController {

    @Autowired
    private StudenServie  servie;


    @GetMapping("/world")
    public Map<String, Object> hello(){
        Map<String ,Object> map =new HashMap<>();
        map.put("hello","world");
        return map;
    }
    @GetMapping("/stuList")
    public List<Student> getStuList(){
        return servie.list();
    }

    @DeleteMapping("/delStu/{id}")
    public Boolean delStu(@PathVariable String id){
        return servie.removeById(id);
    }
    @PostMapping("/add/Stu")
    public Boolean addStu(@RequestBody Student student){
        return servie.save(student);
    }

    @PutMapping("/update/Stu")
    public Boolean updateStu(@RequestBody Student student){
        return servie.updateById(student);
    }

    @GetMapping("/getStu")
    public Student getStuByName(String name){
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("name",name);
        return servie.getOne(wrapper);
    }

    @GetMapping("/sendMail")
    public Boolean sendMail(){
        return servie.sendMailBySex();
    }
}
