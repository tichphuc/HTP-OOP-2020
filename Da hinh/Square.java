public class Square extends Shape {
	private double side;
	
	public Square(){}
	
	public Square(double side){
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled){
		super(color, filled);
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(double side){
		this.side = side;
	}
	
	public double getArea(){
		double area = side*side;
		return area	;
	}
	
	public double getPerimeter(){
		double perimeter = 4*side;
		return perimeter;
	}
	
	public String toString(){
		String text = "[side=?,color=?,filled=?]";
		return text;
	}
}