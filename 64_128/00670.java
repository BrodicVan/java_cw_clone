/**
 * Set whether or not responses to this request should be cached.
 *
 * @return This Request object to allow for chaining.
 */
public final Request<?> setShouldCache(boolean shouldCache){
    mShouldCache = shouldCache;
    return this;
}