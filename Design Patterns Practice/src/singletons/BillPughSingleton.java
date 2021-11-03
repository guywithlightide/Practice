package singletons;

import java.io.Serializable;

public class BillPughSingleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2437923881593506024L;
	private String data;
	
	private BillPughSingleton() {
		data = "Instantiated "+this.hashCode();
	}

	private static class SingletonHelper{
		private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.BILL_PUGH_SINGLETON;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
