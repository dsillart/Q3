package Q3;

public class Triangle extends GeometricObject{

	private double side1;
	private double side2;
	private double side3;

	//the no-arg triangle constructor
	public Triangle() {
		
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//the three-arg triangle constructor
	public Triangle(double side1, double side2, double side3) {
		
		double one = 0;
		double two = 0;
		double three = 0;
		
		side1 = one;
		side2 = two;
		side3 = three;
	}

	//Side getter Methods
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	//method that returns the area of a given triangle
	public double getArea() {
		double p = (side1+side2+side3)/2;
		double area = Math.pow((p*(p-side1)*(p-side2)*(p-side3)),0.5);
		return area;
	}
	//method that returns the perimeter of a given triangle
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString(){
	    return "created on " + this.getDateCreated() + "\ncolor: " + this.getColor() +
	  	      " and filled: " + this.isFilled();
	}
}
