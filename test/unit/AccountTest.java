package unit;

import static org.junit.Assert.*;

import models.Account;
import models.Service;
import models.ServiceContract;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	static Account account;
	
	@BeforeClass
	public static void before() {
		account = Account.createNewAccount();
	}
	
	@Test
	public void testAccountCreation() {
		assertNotNull("Account is null", account);
	}
	
	@Test
	public void testAddingServiceContractToAccount() {
		Service service = Service.CELLULAR_TELEPHONE_SERVICE;
		ServiceContract contract = ServiceContract.createNewServiceContract(service);
		account.addServiceContract(contract);
		assertTrue(account.serviceContracts.contains(contract));
	}
	
}
