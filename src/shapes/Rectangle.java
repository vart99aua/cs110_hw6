package shapes;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(){
		this.width = 10;
		this.height = 11;
	} 
	
	public Rectangle(int varwidth, int varheight){
		this.width = varwidth;
		this.height = varheight;
		
	}
	public int getArea(){
		return this.width * this.height;
	}
}

