/**
 * Records a command to be later returned by {@link #getCommand()}.
 * @param aCmd command.
 * @return this instance to allow calls chaining.
 */
public RecordedCommandReader add(Command aCmd){
    mCommands.add(aCmd);
    return this;
}