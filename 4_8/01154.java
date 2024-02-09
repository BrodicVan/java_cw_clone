/**
 * Constructs an exit exception.
 * @param msg the message to be displayed.
 * @param status the status code returned via System.exit()
 */
public ExitException(String msg, int status){
    super(msg);
    this.status = status;
}