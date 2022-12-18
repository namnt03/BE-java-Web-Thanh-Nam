package javaOracleWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.Role;

@Mapper
public interface RoleMapper {
	List<Role> getAllRole();
}
