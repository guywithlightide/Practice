package factories;

public abstract class Car {
	public abstract String getModel();
	public abstract String getColor();
	public abstract String getPrice();
	@Override
	public String toString() {
		return "Car [getModel()=" + getModel() + ", getColor()=" + getColor() + ", getPrice()=" + getPrice() + "]";
	}
		
}
