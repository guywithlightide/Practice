package factories;

public class SUV extends Car{

	private String model;
	private String color;
	private String price;
	
	public SUV(String model2, String color2, String price2) {
		this.model = model2;
		this.color = color2;
		this.price = price2;	
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getPrice() {
		return this.price;
	}

}
