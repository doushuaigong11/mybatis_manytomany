package com.zz.dao;

import com.zz.pojo.Course;
import com.zz.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Demo {

    private static SqlSession sqlSession;
    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        sqlSession = factory.openSession();
    }

    public static void select(){
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = mapper.findByStuId(3);
        List<Course> courseList = student.getCourseList();
        for (Course courses:courseList) {
            System.out.println(courses.toString());
        }
        sqlSession.commit();

        sqlSession.close();
    }
    public static void select1(){
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = mapper.findById(3);
        List<Course> courseList = student.getCourseList();
        for (Course courses:courseList) {
            System.out.println(courses.toString());
        }
        sqlSession.commit();

        sqlSession.close();
    }

    public static void main(String[] args) {
        select1();
    }

}
