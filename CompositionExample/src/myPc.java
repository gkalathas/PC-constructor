
public class myPc {
	private motherboard myMotherboard;
	private graphicsCard myGpu;
	private PSU myPsu;
	private pcCase myPcCase;
	private monitor myMonitor;
	
	public myPc(motherboard myMotherboard, graphicsCard myGpu, PSU myPsu, pcCase myPcCase, monitor myMonitor) {
		this.myMotherboard = myMotherboard;
		this.myGpu = myGpu;
		this.myPsu = myPsu;
		this.myPcCase = myPcCase;
		this.myMonitor = myMonitor;
	}

	public motherboard getMyMotherboard() {
		return myMotherboard;
	}

	public graphicsCard getMyGpu() {
		return myGpu;
	}

	public PSU getMyPsu() {
		return myPsu;
	}

	public pcCase getMyPcCase() {
		return myPcCase;
	}

	public monitor getMyMonitor() {
		return myMonitor;
	}
	
	
	
}
