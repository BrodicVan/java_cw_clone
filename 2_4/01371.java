/**
 * Creates a new InvalidRedirectLocationException with the specified detail message.
 * 
 * @param message the exception detail message
 * @param location redirect location
 */
public InvalidRedirectLocationException(final String message, final String location){
    super(message);
    this.location = location;
}