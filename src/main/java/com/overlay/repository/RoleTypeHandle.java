package com.overlay.repository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.overlay.model.Role;

public class RoleTypeHandle implements TypeHandler<Role>{

	@Override
	public void setParameter(PreparedStatement ps, int paramInt, Role paramType, JdbcType jdbcType) throws SQLException {
		ps.setInt(paramInt, paramType.getId());
		
	}

	@Override
	public Role getResult(ResultSet rs, String columnName) throws SQLException {
		String code = rs.getString(columnName);
		return Role.find(code).get();
	}

	@Override
	public Role getResult(ResultSet rs, int columnIndex) throws SQLException {
		String code = rs.getString(columnIndex);
		return Role.find(code).get();
	}

	@Override
	public Role getResult(CallableStatement cs, int columnIndex) throws SQLException {
		String code = cs.getString(columnIndex);
		return Role.find(code).get();
	}

}
