public class FibonacciSequence {
    // Method to calculate the nth term in the Fibonacci sequence using recursion
    public static int calculateFibonacci(int term) {
        if (term < 0) throw new IllegalArgumentException("Input cannot be negative");
        if (term == 0) return 0;
        if (term == 1) return 1;
        return calculateFibonacci(term - 1) + calculateFibonacci(term - 2);
    }

    public static void main(String[] args) {
        int position = 10;
        System.out.println("INFO: Starting Fibonacci calculation...");
        System.out.println("INFO: Input position: " + position);

        int fibonacciValue = calculateFibonacci(position);

        System.out.println("INFO: Fibonacci term at position " + position + " is " + fibonacciValue);
        System.out.println("INFO: This calculation was completed successfully using a recursive method.");
    }
}
