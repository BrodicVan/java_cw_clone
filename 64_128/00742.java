/**
 * <p>
 * Set a callback called for every line output to STDERR by the shell
 * </p>
 * <p>
 * The thread on which the callback executes is dependent on various
 * factors, see {@link eu.chainfire.libsuperuser.Shell.Interactive} for further details
 * </p>
 * 
 * @param onLineListener Callback to be called for each line
 * @return This Builder object for method chaining
 */
public Builder setOnSTDERRLineListener(OnLineListener onLineListener){
    this.onSTDERRLineListener = onLineListener;
    return this;
}