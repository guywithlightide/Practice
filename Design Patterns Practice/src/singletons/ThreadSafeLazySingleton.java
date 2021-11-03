package singletons;

public class ThreadSafeLazySingleton {
	
	private String data;
	
	private static ThreadSafeLazySingleton lazySingleton;
	
	private ThreadSafeLazySingleton() {
	}
	
	public String getData() {
		return this.data;
	}
	
	public static synchronized ThreadSafeLazySingleton getInstance() {
	
			if(lazySingleton==null) {
				lazySingleton = new ThreadSafeLazySingleton();
				lazySingleton.setData("Thread safe singleton instatitated lazily : "+lazySingleton.hashCode());
			}					
				
		return lazySingleton;
		
	}

	private void setData(String string) {
		this.data = string;		
	}

}
