package com.example.demo3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo3.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getManStu();
}
