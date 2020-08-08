import java.lang.Math;
public class Cylinder extends Circle{
	private double height = 1.0;
	
	public Cylinder(){
	}
	
	public Cylinder(double radius){
		super(radius);
	}
	
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color){
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getVolume(){
		double volume;
		double area = getArea();
		return volume = height*area;
	}
	
	public String toString(){
		String text2 = ("Cylinder[" + super.toString() + ", height = h");
		return text2;
	}
	
	public double getArea(){
		double area2 = 2*super.getArea();
		return area2;
	}
}
