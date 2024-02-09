/**
 * Constructs an instance of an OriginatorMessage
 *
 * @param originator The client who created this message
 * @param message The contents of the message
 */
public OriginatorMessage(ConnectionToClient originator, Object message){
  this.originator = originator;
  this.message = message;
}