/** Limits the number of results returned by queries. */
public QueryBuilder<T> limit(int limit){
    this.limit = limit;
    return this;
}