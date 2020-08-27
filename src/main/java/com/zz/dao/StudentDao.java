package com.zz.dao;

import com.zz.pojo.Student;

public interface StudentDao {
    Student findByStuId (Integer id);
    Student findById (Integer id);
}
