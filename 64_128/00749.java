/**
 * <p>
 * Automatically create a handler if possible ? Default to true
 * </p>
 * <p>
 * See {@link eu.chainfire.libsuperuser.Shell.Interactive} for further details on threading and
 * handlers
 * </p>
 * 
 * @param autoHandler Auto-create handler ?
 * @return This Builder object for method chaining
 */
public Builder setAutoHandler(boolean autoHandler){
    this.autoHandler = autoHandler;
    return this;
}