package factories;

public class CarFactorySwitched {
	
	public static Car getCar(String type,String model,String color, String price) {
		switch (type) {
		case "Sedan":
			return new Sedan(model,color,price);
		case "SUV":
			return new SUV(model,color,price);
		default:
			break;
		}
		return null;
	}

}
