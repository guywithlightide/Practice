package factories;

public class CarFactory{
	public static Car getCar(AbstractFactory abstractFactory) {
		return abstractFactory.createCar();
	}
}
