package anonclass;

public class MyConnection  implements IConnection{
	
	public void connect(String connectionDetails) {
		System.out.println("Successfully established Connection to the server - " + connectionDetails);
	}

	

}
