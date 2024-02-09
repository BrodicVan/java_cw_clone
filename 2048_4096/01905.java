/**
 * Sets the bypass document level validation flag.
 *
 * <p>For bulk operations use: {@link BulkWriteOptions#bypassDocumentValidation(Boolean)}</p>
 *
 * @param bypassDocumentValidation If true, allows the write to opt-out of document level validation.
 * @return this
 */
public InsertOneOptions bypassDocumentValidation(@Nullable final Boolean bypassDocumentValidation){
    this.bypassDocumentValidation = bypassDocumentValidation;
    return this;
}