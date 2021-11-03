package singletons;

public class EagerSingleton {
	
	private String data;
	
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance() {
		eagerSingleton.setData("Eager singleton instatitated : "+eagerSingleton.hashCode());
		return eagerSingleton;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
