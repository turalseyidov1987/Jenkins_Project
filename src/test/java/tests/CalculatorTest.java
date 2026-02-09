package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        System.out.println("Testing addition...");
        int result = 5 + 10;
        assertEquals(result, 15, "5 + 10 should equal 15");
        System.out.println("✓ Addition test passed!");
    }

    @Test
    public void testSubtraction() {
        System.out.println("Testing subtraction...");
        int result = 20 - 8;
        assertEquals(result, 12, "20 - 8 should equal 12");
        System.out.println("✓ Subtraction test passed!");
    }

    @Test
    public void testMultiplication() {
        System.out.println("Testing multiplication...");
        int result = 6 * 7;
        assertEquals(result, 42, "6 * 7 should equal 42");
        System.out.println("✓ Multiplication test passed!");
    }

    @Test
    public void testDivision() {
        System.out.println("Testing division...");
        double result = 100.0 / 4.0;
        assertEquals(result, 25.0, "100 / 4 should equal 25");
        System.out.println("✓ Division test passed!");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        System.out.println("Testing division by zero...");
        int result = 10 / 0; // Bu exception fırlatacak
    }
}