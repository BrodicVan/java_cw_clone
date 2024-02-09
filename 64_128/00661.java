/**
 * Sets the sequence number of this request.  Used by {@link RequestQueue}.
 *
 * @return This Request object to allow for chaining.
 */
public final Request<?> setSequence(int sequence){
    mSequence = sequence;
    return this;
}