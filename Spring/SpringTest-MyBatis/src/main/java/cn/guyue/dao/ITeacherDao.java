package cn.guyue.dao;

import cn.guyue.bean.Teacher;

public interface ITeacherDao {

    void insertTeacher(Teacher teacher);
    Teacher selectTeacherById(int id);

}
