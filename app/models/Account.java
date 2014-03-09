package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToMany;

import play.db.ebean.Model;

public class Account extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7173959866694207890L;
	
	
	/*
	 * Fields
	 */
	@ManyToMany
	public List<ServiceContract> serviceContracts;
	
	
	
	private Account() {};
	
	/**
	 * Static factory method
	 * @return
	 */
	public static Account createNewAccount() {
		Account account = new Account();
		account.serviceContracts = new ArrayList<>();
		return account;
	}
	
	
	/*
	 * Methods
	 */
	public void addServiceContract(ServiceContract contract) {
		this.serviceContracts.add(contract);
	}
	
}
