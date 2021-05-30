package com.briup.Test;

import com.briup.dao.StudentMapper;
import com.briup.pojo.Student;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentMapperTest {

    @Test
    public void test() {
        try {
            SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            Student student = studentMapper.selectStudentWithAddress(1);
            sqlSession.commit();
            System.out.println("Student:" + student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
