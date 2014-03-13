package models;

import javax.persistence.Id;

import play.db.ebean.Model;

public class ServiceContract extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	
	
	public static ServiceContract create() {
		return new ServiceContract();
	}
	
}
