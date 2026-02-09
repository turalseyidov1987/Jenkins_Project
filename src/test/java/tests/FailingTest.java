package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FailingTest {

    @Test
    public void testPassingScenario() {
        System.out.println("This test will PASS");
        assertTrue(true, "This should pass");
    }

    @Test
    public void testFailingScenario() {
        System.out.println("This test will FAIL");
        assertTrue(false, "This test is designed to fail for reporting demo");
    }

    @Test
    public void testAnotherFailure() {
        System.out.println("Another failing test");
        assertEquals(10, 20, "10 should not equal 20 - Expected failure");
    }
}