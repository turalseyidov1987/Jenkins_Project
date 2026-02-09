package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StringTest {

    @Test
    public void testStringLength() {
        System.out.println("Testing string length...");
        String text = "Jenkins Automation";
        assertEquals(text.length(), 18, "String length should be 18");
        System.out.println("✓ String length test passed!");
    }

    @Test
    public void testStringContains() {
        System.out.println("Testing string contains...");
        String text = "Selenium Grid with Jenkins";
        assertTrue(text.contains("Selenium"), "Text should contain 'Selenium'");
        assertTrue(text.contains("Jenkins"), "Text should contain 'Jenkins'");
        System.out.println("✓ String contains test passed!");
    }

    @Test
    public void testStringUpperCase() {
        System.out.println("Testing string uppercase...");
        String text = "testng";
        String upper = text.toUpperCase();
        assertEquals(upper, "TESTNG", "Uppercase conversion failed");
        System.out.println("✓ String uppercase test passed!");
    }

    @Test
    public void testStringEquality() {
        System.out.println("Testing string equality...");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        assertEquals(str1, str2, "Strings should be equal");
        assertNotEquals(str1, str3, "Strings should not be equal");
        System.out.println("✓ String equality test passed!");
    }

    @Test
    public void testNullString() {
        System.out.println("Testing null string...");
        String nullStr = null;
        String emptyStr = "";

        assertNull(nullStr, "String should be null");
        assertNotNull(emptyStr, "String should not be null");
        System.out.println("✓ Null string test passed!");
    }
}