package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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

	@ManyToMany
	public List<Contact> contacts;
	
	@OneToOne
	public Contact primaryContact;
	
	
	
	private Account() {};
	
	/**
	 * Static factory method
	 * @return
	 */
	public static Account create() {
		Account account = new Account();
		account.serviceContracts = new ArrayList<>();
		account.contacts = new ArrayList<>();
		return account;
	}
	
	
	/*
	 * Methods
	 */
	public void addServiceContract(ServiceContract contract) {
		this.serviceContracts.add(contract);
	}

	public void bill() {
		
	}

	public List<Object> findBills() {
		ArrayList<Object> bills = new ArrayList<>();
		bills.add(new Account());
		return bills;
	}

	public void addContact(Contact newContact) {
		this.contacts.add(newContact);
		if (this.primaryContact == null) {
			this.primaryContact = newContact;
		}
	}
	
}
