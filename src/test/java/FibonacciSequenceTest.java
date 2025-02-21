import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSequenceTest {

    @Test
    public void testFibonacciBaseCases() {
        assertEquals(0, FibonacciSequence.calculateFibonacci(0)); // Test for 0
        assertEquals(1, FibonacciSequence.calculateFibonacci(1)); // Test for 1
    }

    @Test
    public void testFibonacciGeneralCases() {
        assertEquals(1, FibonacciSequence.calculateFibonacci(2)); // 1
        assertEquals(3, FibonacciSequence.calculateFibonacci(4)); // 3
        assertEquals(5, FibonacciSequence.calculateFibonacci(5)); // 5
        assertEquals(55, FibonacciSequence.calculateFibonacci(10)); // 55
    }

    @Test
    public void testNegativeInput() {
        try {
            FibonacciSequence.calculateFibonacci(-5);
            fail("Should throw an IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
    }


}
