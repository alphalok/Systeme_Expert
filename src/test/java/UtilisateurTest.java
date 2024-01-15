import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.systemeexpert.Utilisateur;

class UtilisateurTest {

	private static class UtilisateurTestImpl extends Utilisateur {
        public UtilisateurTestImpl(String name, String password, int id, String email) {
            super(name, password, id, email);
        }
        
        public UtilisateurTestImpl() {
            
        }
    }

	@Test
	void testGetName() {
		Utilisateur utilisateur = new UtilisateurTestImpl("John", "password123", 1, "john@example.com");
        assertEquals("John", utilisateur.getName());
	}

	@Test
	void testSetName() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        utilisateur.setName("Alice");
        assertEquals("Alice", utilisateur.getName());
	}

	@Test
	void testGetPassword() {
		 Utilisateur utilisateur = new UtilisateurTestImpl("Bob", "secret", 2, "bob@example.com");
	     assertEquals("secret", utilisateur.getPassword());
	}

	@Test
	void testSetPassword() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        utilisateur.setPassword("newPassword");
        assertEquals("newPassword", utilisateur.getPassword());
	}

	@Test
	void testGetId() {
		Utilisateur utilisateur = new UtilisateurTestImpl("Charlie", "pass123", 3, "charlie@example.com");
        assertEquals(3, utilisateur.getId());
	}

	@Test
	void testSetId() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        utilisateur.setId(4);
        assertEquals(4, utilisateur.getId());
	}

	@Test
	void testGetEmail() {
		Utilisateur utilisateur = new UtilisateurTestImpl("David", "davidpass", 5, "david@example.com");
        assertEquals("david@example.com", utilisateur.getEmail());
	}

	@Test
	void testSetEmail() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        utilisateur.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", utilisateur.getEmail());
	}

	@Test
	void testIsIS_EXPERT() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        assertFalse(utilisateur.isIS_EXPERT());
	}

	@Test
	void testSetIS_EXPERT() {
		Utilisateur utilisateur = new UtilisateurTestImpl();
        utilisateur.setIS_EXPERT(true);
        assertTrue(utilisateur.isIS_EXPERT());
	}

}
