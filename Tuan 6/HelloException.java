public class  HelloException{
    public static void main(String[] args) {
        // x
        double value = 4 / 2;
        System.out.println("Value = " + value);

        try {
            value = 2 / 0;
            System.out.println("New value = " + value);
        } catch (ArithmeticException e) {
            // x
            System.out.println("An exception");
            System.out.println("Error: " + e.getMessage());
        }
        // x
        System.out.println("Exit!");
    }
}