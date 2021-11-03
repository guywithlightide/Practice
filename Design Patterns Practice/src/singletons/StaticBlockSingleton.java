package singletons;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton staticBlockSingleton;
	
	private StaticBlockSingleton() {
		
	}
	
	static {
		try {
			staticBlockSingleton = new StaticBlockSingleton();
			throw new Exception("Static block threw an exception");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return staticBlockSingleton;
	}
}
