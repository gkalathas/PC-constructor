
public class pcCase {
	private String type;
	private String model;
	private Dimensions dimensions;
	
	public pcCase(String type, String model, Dimensions dimensions) {
		super();
		this.type = type;
		this.model = model;
		this.dimensions = dimensions;
	}
	public void pressPowerButton() {
		System.out.println("Power buttoon pressed"); 
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	

}
