  
public class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;
    public BinaryExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return null;
    }

    public double evaluate() {
        return 0;
    }
}