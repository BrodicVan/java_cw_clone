/**
 * <p>
 * Set a custom handler that will be used to post all callbacks to
 * </p>
 * <p>
 * See {@link Interactive} for further details on threading and
 * handlers
 * </p>
 *
 * @param handler Handler to use
 * @return This Builder object for method chaining
 */
@NonNull
public Builder setHandler(@Nullable Handler handler){
    this.handler = handler;
    return this;
}