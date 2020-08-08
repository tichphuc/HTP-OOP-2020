public class Circle extends Shape{
	protected double radius;
	protected final double PI = 3.14;
	
	public Circle(){}
	
	public Circle (double radius){
		this.radius = radius;
	}
	
	public Circle (double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		//super.getArea();
		double area = PI*radius*radius;
		return area	;
	}
	
	public double getPerimeter(){
		//super.getPerimeter();
		double perimeter = 2*PI*radius;
		return perimeter;
	}
	
	public String toString(){
		//super.toString();
		String text = "Circle[radius=?,color=?,filled=?]";
		return text;
	}
}