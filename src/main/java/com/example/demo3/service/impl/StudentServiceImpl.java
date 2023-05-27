package com.example.demo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.pojo.Student;
import com.example.demo3.service.StudenServie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudenServie {

    /**
     * @return
     */
    @Override
    public Boolean sendMailBySex() {
        List<Student> manStu = this.baseMapper.getManStu();
        manStu.forEach(student -> {
            System.out.println("name is "+student.getName()+"   mail is"+student.getEmail());
        });
        return true;
    }
}
