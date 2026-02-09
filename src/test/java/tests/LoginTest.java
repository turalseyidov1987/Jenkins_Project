package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTest {

    @Test(priority = 1)
    public void testValidLogin() {
        System.out.println("Testing valid login...");
        String username = "admin";
        String password = "admin123";

        assertTrue(username.equals("admin"), "Username should be admin");
        assertTrue(password.length() > 5, "Password should be longer than 5 characters");
        System.out.println("✓ Valid login test passed!");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        System.out.println("Testing invalid login...");
        String username = "";
        String password = "";

        assertTrue(username.isEmpty(), "Username should be empty");
        assertTrue(password.isEmpty(), "Password should be empty");
        System.out.println("✓ Invalid login test passed!");
    }

    @Test(priority = 3)
    public void testPasswordStrength() {
        System.out.println("Testing password strength...");
        String weakPassword = "123";
        String strongPassword = "MyP@ssw0rd123!";

        assertTrue(weakPassword.length() < 5, "Weak password detected");
        assertTrue(strongPassword.length() >= 8, "Strong password validated");
        System.out.println("✓ Password strength test passed!");
    }

    @Test(priority = 4, enabled = false)
    public void testSkippedTest() {
        // Bu test skip edilecek
        System.out.println("This test is skipped");
    }
}