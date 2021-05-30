package com.briup.dao;

import com.briup.pojo.Student;

public interface StudentMapper {

    Student selectStudentWithAddress(int studId);

}
