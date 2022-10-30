package couplingExcerise;

public class Travel {

	// Transport Pointer
	private Transport transport; 

	public Travel(Transport transport) { 
		// Point to the transport object that is passed via constructor 
		this.transport = transport;
	}
	
	public void start() {
		// Via polymorphism call the transports start option for either bus or train 
		transport.start();
	}
 
}
