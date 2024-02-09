/**
 * Sets the offset for query results in combination with {@link #limit(int)}. The first {@code limit} results are
 * skipped and the total number of results will be limited by {@code limit}. You cannot use offset without limit.
 */
public QueryBuilder<T> offset(int offset){
    this.offset = offset;
    return this;
}