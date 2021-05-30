package com.briup.typehandler;

import com.briup.pojo.PhoneNumber;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class phoneTypeHandler implements TypeHandler<PhoneNumber> {
    @Override
    public void setParameter(PreparedStatement ps, int i, PhoneNumber parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public PhoneNumber getResult(ResultSet rs, String columnName) throws SQLException {
        String[] split = rs.getString(columnName).split("-");
        return new PhoneNumber(split[0], split[1], split[2]);
    }

    @Override
    public PhoneNumber getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public PhoneNumber getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
