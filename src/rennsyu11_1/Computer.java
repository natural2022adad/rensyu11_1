package rennsyu11_1;

public class Computer extends TangibleAsset {
	
public Computer (String name,int price, String color) {
	super(name, price, color);
		
	}

	String makerName;
	
	public String getMakerName() {return this.makerName;}

}
