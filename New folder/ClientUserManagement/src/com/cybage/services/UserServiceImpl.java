package com.cybage.services;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserRolePermissions;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;


@Service("userserviceObj")
@Transactional
public class UserServiceImpl implements UserService{
	UserDao daoObj=new UserDaoImpl();
 
	@Override
	public String addNewUser(User obj) {
		// TODO Auto-generated method stub
		
       String response="{\"msg\":\"user not added\"}";
		
		boolean rs =daoObj.addNewUser(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}
		
		return response ;
		
	}

	@Override
	public String addNewPermission(Permission obj) {
		 String response="{\"msg\":\"permission not added\"}";
			
			boolean rs =daoObj.addNewPermission(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String addNewGroup(UserGroup obj) {
		 String response="{\"msg\":\"group not added\"}";
		 
			
			boolean rs =daoObj.addNewGroup(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String addNewRole(Role obj) {
		 String response="{\"msg\":\"Role not added\"}";
		 
			
			boolean rs =daoObj.addNewRole(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String addRolePermission(UserRolePermissions obj) {
		 String response="{\"msg\":\"RolePermission not added\"}";
		 
			
			boolean rs =daoObj.addRolePermission(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String addGroupPermission(UserGroupPermissions obj) {
		 String response="{\"msg\":\"GroupPermission not added\"}";
		 
			
			boolean rs =daoObj.addGroupPermission(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public List<String> sendPermissions() {
		List<String> li=daoObj.sendPermissions();
		return li;
	}

	@Override
	public List<String> sendRole() {
		List<String> li=daoObj.sendRole();
		return li;
		
	}

	@Override
	public List<String> sendGroup() {
		List<String> li=daoObj.sendGroup();
		return li;
		
		
	}

	@Override
	public List<User> sendUsers() {
		List<User> li=daoObj.sendUsers();
		return li;
	}

	@Override
	public User searchUser(String uname) {
		
		User userObj =daoObj.searchUser(uname);
		
		return userObj;
	}

	@Override
	public String deleteUser(String uname) {
         String response="{\"msg\":\"User not deleted\"}";
		
		boolean rs =daoObj.deleteUser(uname);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}
		
		return response ;
	}

	@Override
	public String updateUser(User obj) {
		   String response="{\"msg\":\"user not updated\"}";
			
			boolean rs =daoObj.updateUser(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public List<Role> sendAllRole() {
		List<Role> li=daoObj.sendAllRole();
		return li;
	}

	@Override
	public List<Permission> sendlistPermission() {
		List<Permission> li=daoObj.sendlistPermission();
		return li;
	}

	@Override
	public String deletePermission(String pname) {
		 String response="{\"msg\":\"Permission not deleted\"}";
			
			boolean rs =daoObj.deletePermission(pname);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String updatePermission(Permission obj) {
		 String response="{\"msg\":\"permission not updated\"}";
			
			boolean rs =daoObj.updatePermission(obj);
			if(rs==true)
			{
				response="{\"msg\":\"success\"}";	
			}
			
			return response ;
	}

	@Override
	public String deleteRole(String rname) {
		String response="{\"msg\":\"Role not deleted\"}";
		
		boolean rs =daoObj.deleteRole(rname);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}
		
		return response ;
	}

	@Override
	public List<String> sendLocation() {
		List<String> li=daoObj.sendLocation();
		return li;
	}
	
	


}
