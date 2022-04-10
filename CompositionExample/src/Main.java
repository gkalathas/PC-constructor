
public class Main {

	public static void main(String[] args) {
		motherboard beastMotherboard = new motherboard("GIGABYTE","Gaming 7",4,2);
		pcCase beastCase = new pcCase("Full Tower","Corsair 780T",new Dimensions(80,60));
		graphicsCard beastCard = new graphicsCard("Nvidia","RTX 3090",new graphicsSize(16,14000000,6000000));
		PSU beastPsu = new PSU("THERMALTAKE", "RGB 750W", new Capacity("750 WATT","60 VOLT"));
		monitor beastMonitor = new monitor("DELL","ALIENWARE","34 INCH", new Resolution(4026,2160));
		
		myPc beastPc = new myPc(beastMotherboard,beastCard,beastPsu,beastCase,beastMonitor);
		
		
		beastPc.getMyMonitor().drawPixelAt(1234,456,"red");
		beastPc.getMyMotherboard().runProgram("windows 11");
		beastPc.
	}

}
