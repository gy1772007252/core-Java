package com.briup.Test;

import com.briup.dao.PersonMapper;
import com.briup.pojo.Person;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonMapperTest {

    @Test
    public void test() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.findTutorById(1);
        System.out.println(person);

    }

}
