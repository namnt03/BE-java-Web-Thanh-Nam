package javaOracleWebix.service.impl;

import javaOracleWebix.mapper.RoleMapper;
import javaOracleWebix.service.RoleService;
import javaOracleWebix.entity.Role;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapper mapper1;
	@Override
	public List<Role> getAllRole() {		
		return mapper1.getAllRole();
	}
}
