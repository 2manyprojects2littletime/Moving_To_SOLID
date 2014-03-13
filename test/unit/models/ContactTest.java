package unit.models;

import static org.junit.Assert.*;

import models.Contact;

import org.junit.Test;

public class ContactTest {

	@Test
	public void testCreate() {
		Contact contact = Contact.create();
		assertNotNull(contact);
	}

}
