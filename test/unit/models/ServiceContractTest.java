package unit.models;

import static org.junit.Assert.*;

import models.ServiceContract;

import org.junit.Test;

public class ServiceContractTest {

	@Test
	public void testCreate() {
		ServiceContract contract = ServiceContract.create();
		assertNotNull(contract);
	}

}
