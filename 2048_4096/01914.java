/**
 * Set whether documents will continue to be inserted after a failure to insert one.
 *
 * @param continueOnError whether to continue on error
 * @return this
 */
public InsertOptions continueOnError(final boolean continueOnError){
    this.continueOnError = continueOnError;
    return this;
}