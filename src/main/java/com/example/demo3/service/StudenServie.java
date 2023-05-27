package com.example.demo3.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo3.pojo.Student;

import java.util.List;

public interface StudenServie extends IService<Student> {

    Boolean sendMailBySex();

}
