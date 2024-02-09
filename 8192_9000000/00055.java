/**
 * Instantiates a new Transaction exception.
 *
 * @param code    the code
 * @param message the message
 */
public TransactionException(TransactionExceptionCode code, String message){
    super(message);
    this.code = code;
}