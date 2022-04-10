
public class motherboard {

	private String manufacturer;
	private String model;
	private int ramSlots;
	private int gpuSlots;
	
	public motherboard(String manufacturer, String model, int ramSlots, int gpuSlots) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.ramSlots = ramSlots;
		this.gpuSlots = gpuSlots;
	}
	public void runProgram(String programName) {
		System.out.println("Program"+ programName + "is running");
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getGpuType() {
		return gpuSlots;
	}
	
}
