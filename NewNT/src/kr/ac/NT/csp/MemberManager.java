package kr.ac.NT.csp;

import java.util.List; 

import javax.jdo.JDOHelper; 
import javax.jdo.PersistenceManager; 
import javax.jdo.Query; 

 
public class MemberManager { 
	 
 	public static Member addMember(String name, String stuid, String phone, String email, String kakao, String leader, String gitid) 
	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Member m = new Member(name, stuid, phone, email, kakao, leader, gitid); 
 		pm.makePersistent(m); 
 		
 		return m; 
 	} 
 	 
 	public static Member getMember(String key) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Member m = pm.getObjectById(Member.class,key); 
 		 
 		return m; 
 	}
 	 
 	public static void deleteMember(String key) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Member m = MemberManager.getMember(key); 
 		pm.deletePersistent(m); 
 	} 
 	
 	public static UserAccount SignUpUser(String userid, String password, String name)
 	{
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
 		UserAccount ua = new UserAccount(userid,password,name);
 		pm.makePersistent(ua);
 		
 		return ua;
 	}
 	
 	public static List<UserAccount> Login(String userid){
		
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
 		
 		Query qry = pm.newQuery(UserAccount.class);
 		qry.setFilter("userID == idParam");
		qry.declareParameters("String idParam");
		
		List<UserAccount> userAccount = (List<UserAccount>) qry.execute(userid);
 		
		return userAccount;
 		
 	}
 	 
 	public static List<Member> getMemberByName(String name) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Query qry = pm.newQuery(Member.class); 
 		qry.setFilter("name == nameParam"); 
 		qry.declareParameters("String nameParam"); 
 		 
 		List<Member> memberList = (List<Member>) qry.execute(name); 
 		 
 		return memberList; 
 	} 
 	 
 	
 	public static List<Member> getAllMembers() 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Query qry = pm.newQuery(Member.class); 
 		List<Member> memberList = (List<Member>) qry.execute(); 
 
 		return memberList; 
 	} 
} 
