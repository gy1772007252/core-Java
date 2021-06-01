package com.briup.dao.impl;

import com.briup.bean.Teacher;
import com.briup.dao.ITeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TeacherDaoImpl implements ITeacherDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Teacher t) {
        String sql = "insert into teacher values(?,?,?,?)";
        Object[] args = {t.getId(),t.getName(),t.getAge(),t.getSalary()};
        jdbcTemplate.update(sql,args);
    }

    @Override
    public void update(Teacher t) {
        String sql = "update teacher set name = ?,age = ?,salary = ? where id = ?";
        Object[] args = {t.getName(),t.getAge(),t.getSalary(),t.getId()};
        jdbcTemplate.update(sql,args);
    }

    @Override
    public void deleteAll() {
        String sql = "delete from teacher";
        jdbcTemplate.update(sql);
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from teacher where id = ?";
        Object[] args = {id};
        jdbcTemplate.update(sql,args);
    }

    @Override
    public Teacher selectById(int id) {
        String sql = "select * from teacher where id = ?";
        Object[] args = {id};
        Teacher teacher = jdbcTemplate.queryForObject(sql, args, new RowMapper<Teacher>() {
            @Override
            public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
                Teacher t = new Teacher();
                t.setId(resultSet.getInt("id"));
                t.setName(resultSet.getString("name"));
                t.setAge(resultSet.getInt("age"));
                t.setSalary(resultSet.getDouble("salary"));
                return t;
            }
        });
        return teacher;
    }

    @Override
    public List<Teacher> selectAll() {
        String sql = "select * from teacher";
        List<Teacher> list = jdbcTemplate.query(sql, new RowMapper<Teacher>() {
            @Override
            public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt("id"));
                teacher.setName(resultSet.getString("name"));
                teacher.setAge(resultSet.getInt("age"));
                teacher.setSalary(resultSet.getDouble("salary"));
                return teacher;
            }
        });
        return list;
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from teacher";
        return jdbcTemplate.queryForObject(sql, int.class);
    }
}
