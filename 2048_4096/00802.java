/**
 * Annotates this request with an entry retrieved for it from cache. Used for cache coherency
 * support.
 *
 * @return This Request object to allow for chaining.
 */
public Request<?> setCacheEntry(Cache.Entry entry){
    mCacheEntry = entry;
    return this;
}