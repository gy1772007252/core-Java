package com.briup.dao;

import com.briup.bean.Teacher;

import java.util.List;

public interface ITeacherDao {

    void insert(Teacher teacher);
    void update(Teacher teacher);
    void deleteAll();
    void deleteById(int id);
    Teacher selectById(int id);
    List<Teacher> selectAll();
    int selectCount();

}
