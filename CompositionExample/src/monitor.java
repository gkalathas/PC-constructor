
public class monitor {
	private String manufacturer; 
	private String model;
	private String size;
	private Resolution nativeResolution;
	
	public monitor(String manufacturer, String model, String size, Resolution nativeResolution) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	public void drawPixelAt(int x , int y, String color) {
		System.out.println("Draw pixel at" + x +","+ y +"color" + color);
		
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public String getSize() {
		return size;
	}
	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	


}
