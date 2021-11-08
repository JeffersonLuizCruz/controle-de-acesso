package com.overlay.repository.imp;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.EnumTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import com.overlay.model.Role;

@MappedTypes(Role.class)
public class RoleTypeHandle extends EnumTypeHandler<Role>{

	public RoleTypeHandle(Class<Role> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	   @Override
	   public void setNonNullParameter(PreparedStatement ps, int i, Role parameter, JdbcType jdbcType)
	      throws SQLException {
	      ps.setString(i, parameter.name());
	   }
	 
	   @Override
	   public Role getNullableResult(ResultSet rs, String columnName) throws SQLException {
	      String code = rs.getString(columnName);
	      return Role.find(code).get();
	   }
	 
	   @Override
	   public Role getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
	      String code = rs.getString(columnIndex);
	      return Role.find(code).get();
	   }
	 
	   @Override
	   public Role getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	      String code = cs.getString(columnIndex);
	      return Role.find(code).get();
	   }

}
