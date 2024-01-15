package com.mycompany.systemeexpert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExpertTest {

    
	@Test
    void testStatus() {
        Expert expert = new Expert("Alice", "password123", 1, "alice@example.com");
        String expectedStatus = "Alice is an expert";
        
        // Call the status method and check if the returned status is as expected
        assertEquals(expectedStatus, expert.status());
    }
}
