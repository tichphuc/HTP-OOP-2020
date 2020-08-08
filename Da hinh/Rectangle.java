public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle(){}
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth(){
		return width;
	}
	
	protected void setWidth(double width){
		this.width = width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getArea(){
		//super.getArea();
		double area = width*length;
		return area	;
	}
	
	public double getPerimeter(){
		//super.getPerimeter();
		double perimeter = 2*(width + length);
		return perimeter;
	}
	
	public String toString(){
		//super.toString();
		String text = "Rectangle[width=?,length=?,color=?,filled=?]";
		return text;
	}
}