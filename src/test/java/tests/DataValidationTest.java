package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DataValidationTest {

    @DataProvider(name = "emailData")
    public Object[][] emailDataProvider() {
        return new Object[][] {
                {"test@example.com", true},
                {"user.name@company.org", true},
                {"invalid-email", false},
                {"@example.com", false},
                {"test@.com", false}
        };
    }

    @Test(dataProvider = "emailData")
    public void testEmailValidation(String email, boolean isValid) {
        System.out.println("Testing email: " + email);
        boolean actualResult = email.contains("@") && email.contains(".");
        assertEquals(actualResult, isValid, "Email validation failed for: " + email);
    }

    @Test
    public void testPhoneNumberValidation() {
        System.out.println("Testing phone number validation...");
        String validPhone = "5551234567";
        String invalidPhone = "123";

        assertTrue(validPhone.length() == 10, "Valid phone should be 10 digits");
        assertFalse(invalidPhone.length() == 10, "Invalid phone detected");
        System.out.println("✓ Phone number validation passed!");
    }

    @Test
    public void testAgeValidation() {
        System.out.println("Testing age validation...");
        int age = 25;

        assertTrue(age >= 18, "Age should be 18 or above");
        assertTrue(age <= 100, "Age should be realistic");
        System.out.println("✓ Age validation passed!");
    }
}