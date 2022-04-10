
public class graphicsCard {
	private String manufacturer;
	private String model;
	private graphicsSize graphicsSize;
	
	public graphicsCard(String manufacturer, String model, graphicsSize graphicsSize) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.graphicsSize = graphicsSize;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public graphicsSize getGraphicsSize() {
		return graphicsSize;
	}
	
	
	
}