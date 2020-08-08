public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student (String name, String address, String program, int year, double fee){
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram(){
		return program;
	}
	
	public void setProgram(String program){
		this.program = program;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public double getFee(){
		return fee;
	}
	
	public void setFee(double Fee){
		this.fee = fee;
	}
	
	public String toString(){
		String text = ("Student[" + super.toString() + "] program = ?, year = ?, fee = ?");
		return text;
	}
}