package com.zz.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Student {

    private Integer sid;
    private String sname;
    private List<Course> courseList;
}
