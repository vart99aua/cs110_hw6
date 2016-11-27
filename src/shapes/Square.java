package shapes;

public class Square {

	private int length;
	
	public Square(){                  //Default Constructor
		this.length = 10;
	}
	
	public Square(int varlength){      //parameter constructor
		this.length = varlength;
	}
	
	public int getArea(){
		return this.length * this.length;
	}
	
	
}



