package unit.models;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import models.Account;
import models.Contact;
import models.ServiceContract;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	static Account account;
	
	@Before
	public void before() {
		account = Account.create();
	}
	
	@Test
	public void testAccountCreation() {
		assertNotNull("Account is null", account);
	}
	
	@Test
	public void testAccountContactList() {
		Contact newContact = Contact.create();
		account.addContact(newContact);
		assertTrue(account.contacts.size() == 1);
	}
	
	@Test
	public void testAccountPrimaryContact() {
		Contact newContact = Contact.create();
		account.addContact(newContact);
		assertNotNull(account.primaryContact);
	}
	
	@Test
	public void testAddingServiceContractToAccount() {
		ServiceContract contract = ServiceContract.create();
		account.addServiceContract(contract);
		assertTrue(account.serviceContracts.contains(contract));
	}
	
	@Test
	public void testBasicAccountBilling() {
		account.bill();
		assertTrue(account.findBills().size() == 1);
	}
	
//	@Test
//	public void testAccountBillingCreatesBills() throws Exception {
//		account.bill();
//		assertTrue
//	}
	
}
