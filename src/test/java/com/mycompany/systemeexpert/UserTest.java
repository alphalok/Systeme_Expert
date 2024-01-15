package com.mycompany.systemeexpert;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class UserTest {
	
	 
	
	@Test
    void testStatus() {
        User user = new User("Alice", "password123", 1, "alice@example.com");
        String expectedStatus = "Alice is not an expert";
        
        // Call the status method and check if the returned status is as expected
        assertEquals(expectedStatus, user.status());
    }

}
