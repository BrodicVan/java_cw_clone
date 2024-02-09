/**
 * Creates a synthetic request for clearing the cache.
 * @param cache Cache to clear
 * @param callback Callback to make on the main thread once the cache is clear,
 * or null for none
 */
public ClearCacheRequest(Cache cache, Runnable callback){
    super(Method.GET, null, null);
    mCache = cache;
    mCallback = callback;
}