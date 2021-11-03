package singletons;

public class ThreadSafeDoubleLockLazySingleton {
	
	private String data;
	
	private static ThreadSafeDoubleLockLazySingleton lazySingleton;
	
	private ThreadSafeDoubleLockLazySingleton() {
	}
	
	public String getData() {
		return this.data;
	}
	
	public static ThreadSafeDoubleLockLazySingleton getInstance() {
	
		synchronized (ThreadSafeDoubleLockLazySingleton.class) {
			if(lazySingleton==null) {
				lazySingleton = new ThreadSafeDoubleLockLazySingleton();
				lazySingleton.setData("Thread safe singleton instatitated lazily : "+lazySingleton.hashCode());
			}								
		}		
				
		return lazySingleton;
		
	}

	private void setData(String string) {
		this.data = string;		
	}

}
