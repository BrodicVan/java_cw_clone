/**
 * Creates a new instance.
 *
 * @param message   The detail message.
 * @param actual    The actual number of bytes in the request.
 * @param permitted The requests size limit, in bytes.
 */
protected SizeException(final String message, final long actual, final long permitted){
    super(message);
    this.actual = actual;
    this.permitted = permitted;
}