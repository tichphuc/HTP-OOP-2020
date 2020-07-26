public class Fraction{
	private int numerator;
	private int denominator;
	
	//Get
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	//Set
	public void setNumerator(int x){
		this.numerator = x;
	}
	public void setDenominator(int x){
		this.denominator = x;
	} 
	
	public Fraction (int a, int b){
		setNumerator(a);
		setDenominator(b);
	}
	public Fraction (){
	}
	
	
    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
	
	public Fraction reduce() {
		int uc = gcd (this.numerator, this.denominator);
		this.setNumerator (this.numerator/uc);
		this.setDenominator(this.denominator/uc);
		return this;	
	}

	public Fraction add(Fraction a, Fraction b){
		Fraction c = new Fraction();
		c.denominator = a.denominator * b.denominator;
		c.numerator = a.numerator*b.denominator + a.denominator*b.numerator;
		return c;
	}
	
    public Fraction subtract(Fraction other) {
        this.numerator = this.numerator * other.denominator;
        other.numerator = other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        this.numerator -= other.numerator;
        return this;
    }
	
	public Fraction multiply (Fraction a, Fraction b){
		Fraction c = new Fraction();
		c.numerator = a.numerator*b.numerator;
		c.denominator = a.denominator*b.denominator;
		return c;
	}
	
	public Fraction divide (Fraction a, Fraction b){
		Fraction c = new Fraction();
		c.numerator = a.numerator*b.denominator;
		c.denominator = a.denominator*b.numerator;
		return c;
	}
	
	public boolean equals (Object obj){
        if(obj instanceof Fraction) {
            if (this.subtract((Fraction) obj).numerator == 0){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
	}
}