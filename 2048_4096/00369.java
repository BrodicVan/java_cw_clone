/**
 * Indicates whether an extra query should be performed to verify for gaps in the {@code globalSequence} larger
 * than the configured batch size. These gaps could trick the storage engine into believing there are no more
 * events to read, while there are still positions ahead.
 * <p>
 * This check comes at a cost of an extra query when a batch retrieval yields an empty result. This may increase
 * database pressure when processors are at the HEAD of a stream, as each batch retrieval will result in an
 * extra query, if there are no results.
 * <p>
 * Note that the extra query checks for the smallest globalSequence, higher than the last one seen. This query
 * can be executed using an index, which should be a relatively cheap query for most databases.
 * <p>
 * Defaults to {@code true}
 *
 * @param extendedGapCheckEnabled whether to enable the "extended gap check". Defaults to {@code true}.
 *
 * @return the current Builder instance, for fluent interfacing
 */
public Builder extendedGapCheckEnabled(boolean extendedGapCheckEnabled){
    this.extendedGapCheckEnabled = extendedGapCheckEnabled;
    return this;
}