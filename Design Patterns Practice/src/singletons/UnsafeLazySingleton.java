package singletons;

public class UnsafeLazySingleton {
	
	private String data;
	
	private static UnsafeLazySingleton lazySingleton;
	
	private UnsafeLazySingleton() {
	}
	
	public String getData() {
		return this.data;
	}
	
	public static UnsafeLazySingleton getInstance() {
		
		if(lazySingleton==null) {
			lazySingleton = new UnsafeLazySingleton();
			lazySingleton.setData("Unsafe singleton instatitated lazily : "+lazySingleton.hashCode());
		}		
		return lazySingleton;
		
	}

	private void setData(String string) {
		this.data = string;		
	}

}
