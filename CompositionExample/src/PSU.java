
public class PSU {
	private String manufacturer;
	private String model;
	private Capacity capacity;
	
	public PSU(String manufacturer, String model, Capacity capacity) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.capacity = capacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public Capacity getCapacity() {
		return capacity;
	}
	
	

}
