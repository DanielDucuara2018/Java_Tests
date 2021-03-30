package test;

public class Main {
	
	/*
	 * The static value "nb_value" doesn't change when a new session instance is created
	 * The nb_session value is shared by all Session instances 
	 * */
	 public static void main(String[] args) {
		
		Session session = new Session(); // New Session instance
		System.out.println(session); // Result : Session [session_id=0 number of sessions=0]		
		
		session.setSession_id(1000); // session_id value is set to 1000	using a Session instance
		Session.setNb_session(1); // nb_session value is set to 1 using the static way allocation	
		System.out.println(session); // Result : Session [session_id=1000 number of sessions=1]	
		
		Session session2 = new Session(); // New Session instance
		System.out.println(session2); // Result : Session [session_id=0 number of sessions=1] -> Static attribute conserves its value even when a new Session instance is created	
		
		session2.setSession_id(2000); // session_id value is set to 2000	using a Session instance		
		Session.setNb_session(2); // nb_session value is set to 2 using the static way allocation	
		System.out.println(session2); // Result : Session [session_id=2000 number of sessions=2]	
		
		System.out.println("Final result for both Session instances");
		System.out.println(session); // Result : Session [session_id=1000 number of sessions=2]
		System.out.println(session2); // Result : Session [session_id=2000 number of sessions=2]
	}
	

}
