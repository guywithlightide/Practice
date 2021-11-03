package factories;

public class SedanFactory implements AbstractFactory {

	private String model;
	private String color;
	private String price;
	
	
	
	public SedanFactory(String model, String color, String price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}



	@Override
	public Car createCar() {
		return new Sedan(this.model,this.color,this.price);
	}

}
