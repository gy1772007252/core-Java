package com.briup.Test;

import com.briup.dao.TutorMapper;
import com.briup.pojo.Tutor;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TutorMapperTest {

    @Test
    public void test() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
        Tutor tutor = tutorMapper.findTutorById(1);
        sqlSession.commit();
        System.out.println(tutor);

    }

}
