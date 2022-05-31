package rennsyu11_1;

public class Book extends TangibleAsset {
	
	public Book (String name,int price, String color) {
		super(name, price, color);
		
	}
	String isbn;
	
	public String getIsbn() {return this.isbn;}
	
	

}
