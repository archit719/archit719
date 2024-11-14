public class RemainderWitoutModulus {
    public static void main(String args[]){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend=scanner.nextInt();

        System.out.println("Enter the divisor: ");
        int divisor=scanner.nextInt();
         
        int remainder =calculateRemainder(dividend, divisor);
        System.out.println("The remainder of" +dividend+"divided by"+divisor+"is:" remainder);
        scanner.close();
    }

    public static int calculateRemainder(int dividend, int divisor) {
        
        if (divisor <= 0) {
            throw new IllegalArgumentException("Divisor must be greater than zero.");
        }
        while (dividend >= divisor) {
            dividend -= divisor;
        }
        
        return dividend; // This is the remainder
    }

}