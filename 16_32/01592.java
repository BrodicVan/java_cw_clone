/**
 * Initializes a boolean result with the given value.
 * @param command The command that created the result.
 * @param result The result value.
 */
public BooleanResultImpl(Command command, boolean result){
  super(command);
  this.result = result;
}