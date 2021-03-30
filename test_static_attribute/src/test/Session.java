package test;

public class Session {
	
	private int session_id;
	
	private static int nb_session; // It is possible to create a static class, defining all methods and attributes static. 
								   // A static class is not instantiable

	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public static int getNb_session() {
		return nb_session;
	}

	public static void setNb_session(int nb_session) {
		Session.nb_session = nb_session ;
	}

	@Override
	public String toString() {
		return "Session [session_id=" + session_id + " number of sessions=" + nb_session + "]";
	}

	
	

}
