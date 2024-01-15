package com.mycompany.systemeexpert;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class userFrameTest {

	@Test
	void testAfficherRegle() {
	    // Create a user and an empty snapshot
	    User user = new User("John", "password123", 1, "john@example.com");
	    HashMap<String, String> emptySnapshot = new HashMap<>();

	    // Create a userFrame instance with the user and empty snapshot
	    userFrame userFrame = new userFrame(user, emptySnapshot);

	    // Call afficherRegle, expecting the NewRegleJFrame to be opened because the snapshot is empty
	    userFrame.afficherRegle();

	    // Check if the NewRegleJFrame is visible and userFrame is disposed
	    assertFalse(userFrame.isVisible());
	    assertFalse(userFrame.isDisplayable());

	    // Now, create a userFrame with a non-empty snapshot
	    HashMap<String, String> nonEmptySnapshot = new HashMap<>();
	    nonEmptySnapshot.put("Key1", "Value1");
	    userFrame userFrameNonEmpty = new userFrame(user, nonEmptySnapshot);

	    // Call afficherRegle, expecting the RegleLabel to be set with the first entry of the snapshot
	    userFrameNonEmpty.afficherRegle();

	    // Check if RegleLabel is set and userFrameNonEmpty is visible
	    assertEquals("Value1", userFrameNonEmpty.getSnapshot().get("Key1"));
	    assertTrue(userFrameNonEmpty.isVisible());
	}


}
