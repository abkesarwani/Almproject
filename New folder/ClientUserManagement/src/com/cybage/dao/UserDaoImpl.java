package com.cybage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserRolePermissions;
import com.cybage.model.Client;
import com.cybage.model.ClientPOC;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addNewUser(User obj) {
		// TODO Auto-generated method stub
		
		boolean rs=false;
		
		try {
			 System.out.println("in dao add new user method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
		 	entitymanager.persist(obj);
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
		
	}

	@Override
	public boolean addNewPermission(Permission obj) {

		boolean rs=false;
		
		try {
			 System.out.println("in dao add new permission method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
		 	entitymanager.persist(obj);
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
	}

	@Override
	public boolean addNewGroup(UserGroup obj) {
     boolean rs=false;
		
		try {
			 System.out.println("in dao add new group method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
		 	entitymanager.persist(obj);
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
				return rs;
	}

	@Override
	public boolean addNewRole(Role obj) {
     boolean rs=false;
		
		try {
			 System.out.println("in dao add new role method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
		 	entitymanager.persist(obj);
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
	}

	@Override
	public boolean addRolePermission(UserRolePermissions obj) {
    boolean rs=false;
		
		try {
			 System.out.println("in dao add new rolepermission method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
		 	entitymanager.persist(obj);
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
		
	}

	@Override
	public boolean addGroupPermission(UserGroupPermissions obj) {
		 boolean rs=false;
			
			try {
				 System.out.println("in dao add new grouppermission method");
					EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
				     EntityManager entitymanager = emfactory.createEntityManager( );
				 	entitymanager.getTransaction().begin( );
			 	entitymanager.persist(obj);
			 	entitymanager.getTransaction().commit();

			      entitymanager.close( );
			      emfactory.close( );
			      rs=true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
				
				
				
				return rs;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> sendPermissions() {
		 List<String> list=null;
		try {
			 System.out.println("in dao add new sendpermission method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Query query = entitymanager.
					      createQuery("select p.p_name from Permission p");
					      list = query.getResultList();

		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	@Override
	public List<String> sendRole() {
		 List<String> list=null;
			try {
				 System.out.println("in dao  sendrole method");
					EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
				     EntityManager entitymanager = emfactory.createEntityManager( );
				 	entitymanager.getTransaction().begin( );
				 	Query query = entitymanager.
						      createQuery("select p.r_name from Role p");
						      list = query.getResultList();

			 	entitymanager.getTransaction().commit();

			      entitymanager.close( );
			      emfactory.close( );
			   
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			/* for (String string : list) {
				System.out.println(string);
			}*/
			return list;
	}

	@Override
	public List<String> sendGroup() {
		List<String> list=null;
		try {
			 System.out.println("in dao  sendgroup method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Query query = entitymanager.
					      createQuery("select p.g_name from UserGroup p");
					      list = query.getResultList();

		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		/* for (String string : list) {
			System.out.println(string);
		}*/
		return list;
		
	}

	@Override
	public List<User> sendUsers() {
		List<User> list=null;
		try {
			 System.out.println("in dao  sendallUsers method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Query query = entitymanager.
					      createQuery("select r  from User r");
					      list = query.getResultList();

		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	@Override
	public User searchUser(String uname) {
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
	     EntityManager entitymanager = emfactory.createEntityManager( );
		 	entitymanager.getTransaction().begin( );
		 	
		 	User u = entitymanager.find( User.class, uname);
		 	
		      
	 	entitymanager.getTransaction().commit();

	      entitymanager.close( );
	      emfactory.close( );
		 	
		 	
		return u;
	}

	@Override
	public boolean deleteUser(String uname) {
       boolean rs=false;
		
		try {
			 System.out.println("in dao delete user method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	ClientPOC poc=entitymanager.find( ClientPOC.class, uname );
			    System.out.println(poc);;
			 	
			    if(poc!=null)
			 	{
			 	  rs=false;
			 	}
			 	else
			 	{
			 		 User u = entitymanager.find( User.class, uname );
				 	 u.setU_status("Inactive");
				 	 rs=true;
			 	}
			      
		 	  entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		     
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
	}

	@Override
	public boolean updateUser(User obj) {
		 boolean rs=false;
			
			try {
				 System.out.println("in dao update user method");
					EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
				     EntityManager entitymanager = emfactory.createEntityManager( );
				 	entitymanager.getTransaction().begin( );
				 	User u = entitymanager.find( User.class, obj.getU_name() );
				 	u.setU_status(obj.getU_status());
				 	u.setU_role(obj.getU_role());
				 	u.setU_group(obj.getU_group());
				 	u.setU_contact(obj.getU_contact());
					entitymanager.getTransaction().commit();
					entitymanager.close( );
			      emfactory.close( );
			      rs=true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
					return rs;
	}

	@Override
	public List<Role> sendAllRole() {
		List<Role> list=null;
		try {
			 System.out.println("in dao  sendallRoles method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Query query = entitymanager.
					      createQuery("select r  from Role r");
					      list = query.getResultList();

		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	@Override
	public List<Permission> sendlistPermission() {
		List<Permission> list=null;
		try {
			 System.out.println("in dao  sendallRoles method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Query query = entitymanager.
					      createQuery("select p  from Permission p");
					      list = query.getResultList();

		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	@Override
	public boolean deletePermission(String pname) {
		 boolean rs=false;
			
			try {
				 System.out.println("in dao delete user method");
					EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
				     EntityManager entitymanager = emfactory.createEntityManager( );
				 	entitymanager.getTransaction().begin( );
				 	Permission p = entitymanager.find( Permission.class, pname );
				 	p.setP_status("Inactive");
				      
			 	entitymanager.getTransaction().commit();

			      entitymanager.close( );
			      emfactory.close( );
			      rs=true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
				
				
				
				return rs;
	}

	@Override
	public boolean updatePermission(Permission obj) {
		boolean rs=false;
		
		try {
			 System.out.println("in dao update user method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Permission p= entitymanager.find( Permission.class, obj.getP_name() );
			 	p.setP_desc(obj.getP_desc());
			 	p.setP_status(obj.getP_status());
			 	p.setP_type(obj.getP_type());
				entitymanager.getTransaction().commit();
				entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				return rs;
	}

	@Override
	public boolean deleteRole(String rname) {
		boolean rs=false;
		
		try {
			 System.out.println("in dao delete role method");
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			     EntityManager entitymanager = emfactory.createEntityManager( );
			 	entitymanager.getTransaction().begin( );
			 	Role r = entitymanager.find( Role.class, rname );
			 	r.setR_status("Inactive");
			 
			      
		 	entitymanager.getTransaction().commit();

		      entitymanager.close( );
		      emfactory.close( );
		      rs=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			return rs;
	}

	@Override
	public List<String> sendLocation() {
		 List<String> list=null;
			try {
				 System.out.println("in dao add new sendlocation method");
					EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
				     EntityManager entitymanager = emfactory.createEntityManager( );
				 	entitymanager.getTransaction().begin( );
				 	Query query = entitymanager.
						      createQuery("select p.location from ClientOffices p");
						      list = query.getResultList();

			 	entitymanager.getTransaction().commit();

			      entitymanager.close( );
			      emfactory.close( );
			   
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return list;
	}

	

}
