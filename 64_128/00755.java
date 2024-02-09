/**
 * <p>
 * Set a custom handler that will be used to post all callbacks to
 * </p>
 * <p>
 * See {@link eu.chainfire.libsuperuser.Shell.Interactive} for further details on threading and
 * handlers
 * </p>
 * 
 * @param handler Handler to use
 * @return This Builder object for method chaining
 */
public Builder setHandler(Handler handler){
    this.handler = handler;
    return this;
}