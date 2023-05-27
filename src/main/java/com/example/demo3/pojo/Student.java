package com.example.demo3.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author BianFucang
 * @date 2023/2/10 19:47
 */

@Data
@TableName("student")
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Boolean sex;
}
