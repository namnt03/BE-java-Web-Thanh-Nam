package javaOracleWebix.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.User;

@Mapper
public interface UserMapper {
	// goi lay tat ca khach hang
	List<User> getAllUser();
	
	
	
}
