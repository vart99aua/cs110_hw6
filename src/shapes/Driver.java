package shapes;

import utils.Math;

public class Driver {

    public static void main(String[] args) {
    	
    	Square square1 = new Square();                     //Default Constructor
    	Square square2 = new Square(100);                   //parameter constructor
    	
    	 System.out.println(square1.getArea());
    	 System.out.println(square2.getArea());
    	 
    	Rectangle rectangle1 = new Rectangle();
    	int width = 50;
    	int height = 80;
    	Rectangle rectangle2 = new Rectangle(width, height);

    	double var = 15.6;
    	
    	int var1 = (int)var;
    	
    	 System.out.println(rectangle1.getArea());
    	 System.out.println(rectangle2.getArea());
    	 System.out.println(Math.factorial(var1));
    	 System.out.println(Math.factorialLoop(var1));
    	
    }
}

