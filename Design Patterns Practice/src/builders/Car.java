package builders;

public class Car {
	private String model;
	private String color;
	private String price;
	
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + ", isColorEnabled=" + isColorEnabled
				+ ", isPriceAvailable=" + isPriceAvailable + "]";
	}

	private boolean isColorEnabled;
	private boolean isPriceAvailable;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isColorEnabled() {
		return isColorEnabled;
	}
	public void setColorEnabled(boolean isColorEnabled) {
		this.isColorEnabled = isColorEnabled;
	}
	public boolean isPriceAvailable() {
		return isPriceAvailable;
	}
	public void setPriceAvailable(boolean isPriceAvailable) {
		this.isPriceAvailable = isPriceAvailable;
	}
	
	private Car(CarBuilder carBuilder) {
		this.model = carBuilder.getModel();
		this.color = carBuilder.getColor();
		this.price = carBuilder.getPrice();
		this.isColorEnabled = carBuilder.isColorEnabled;
		this.isPriceAvailable = carBuilder.isPriceAvailable;
	}
	
	public static class CarBuilder{
		private String model;
		private String color;
		private String price;
		private boolean isColorEnabled;
		private boolean isPriceAvailable;
		public CarBuilder(String model) {
			super();
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public String getPrice() {
			return price;
		}
		public CarBuilder setPrice(String price) {
			this.price = price;
			return this;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public boolean isColorEnabled() {
			return isColorEnabled;
		}
		public CarBuilder setColorEnabled(boolean isColorEnabled) {
			this.isColorEnabled = isColorEnabled;
			return this;
		}
		public boolean isPriceAvailable() {
			return isPriceAvailable;
		}
		public CarBuilder setPriceAvailable(boolean isPriceAvailable) {
			this.isPriceAvailable = isPriceAvailable;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
		public CarBuilder printThis() {
			System.out.println(this.hashCode());
			return this;
		}
		
	}
	
	
}
