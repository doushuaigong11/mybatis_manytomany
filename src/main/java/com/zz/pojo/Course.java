package com.zz.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Course {
    private Integer cid;
    private String cname;
    private List<Student> studentList;
}
