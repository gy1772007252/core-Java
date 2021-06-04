package cn.guyue.dao.impl;

import cn.guyue.bean.Teacher;
import cn.guyue.dao.ITeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository//持久层 让spring容器来管理对象，相当于在xml中配置一个bean
public class TeacherDaoImpl implements ITeacherDao {

    @Autowired//提供set()、get()方法
    private JdbcTemplate jdbcTemplate;

    public void insert(Teacher t) {
        String sql = "insert into teacher values(?,?,?,?)";
        Object[] args = {t.getId(),t.getName(),t.getAge(),t.getSalary()};
        jdbcTemplate.update(sql,args);
    }

    public void update(Teacher t) {
        String sql = "update teacher set name = ?,age = ?,salary = ? where id = ?";
        Object[] args = {t.getName(),t.getAge(),t.getSalary(),t.getId()};
        jdbcTemplate.update(sql,args);
    }

    public void deleteAll() {
        String sql = "delete from teacher";
        jdbcTemplate.update(sql);
    }

    public void deleteById(int id) {
        String sql = "delete from teacher where id = ?";
        Object[] args = {id};
        jdbcTemplate.update(sql,args);
    }

    public Teacher selectById(int id) {
        String sql = "select * from teacher where id = ?";
        Object[] args = {id};
        Teacher teacher = jdbcTemplate.queryForObject(sql, args, new RowMapper<Teacher>() {
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

    public List<Teacher> selectAll() {
        String sql = "select * from teacher";
        List<Teacher> list = jdbcTemplate.query(sql, new RowMapper<Teacher>() {
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

    public int selectCount() {
        String sql = "select count(*) from teacher";
        return jdbcTemplate.queryForObject(sql, int.class);
    }
}
