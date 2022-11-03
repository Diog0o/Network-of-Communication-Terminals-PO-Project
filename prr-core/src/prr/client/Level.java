package prr.client;

import prr.communications.Communication;

import java.io.Serializable;

public abstract class Level implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 202208091753L;
	
	private Client _client;
	
	public Level(Client client) {
		_client=client;
	}
	public Client get_client() {
		return _client;
	}

	public void updateLevel() {}

	public abstract String ShowLevel();
	
	public abstract long cost(Communication communication);


	
	
}
