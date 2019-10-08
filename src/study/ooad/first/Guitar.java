package study.ooad.first;

public class Guitar {

	// Variable (Version1)
//	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	
	private String serialNumber, model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;

		
	// Constructor (Version 1)
//	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
//			String topWood) {
//		this.serialNumber = serialNumber;
//		this.price = price;
//		this.builder = builder;
//		this.model = model;
//		this.type = type;
//		this.backWood = backWood;
//		this.topWood = topWood;
//	}
	
	public Guitar(String serialNumber, double price, Builder builder, 
				  String model, Type type, Wood backWood, Wood topWood) 
	{
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}


	// Getter
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public Builder getBuilder() {
		return builder;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	
	
}
