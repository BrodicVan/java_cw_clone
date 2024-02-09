/** 
 * Constructs an unreliable datagram socket and binds it to any available port on the local host machine.
 * 
 * @param drop_probability The associated drop probability
 * 
 * @throws SocketException if the socket could not be opened, or the socket could not bind to the specified local port. 
 */
public DatagramSocketWithLoss(double drop_probability) throws SocketException{
	super(); 
	this.drop_probability = drop_probability;
}