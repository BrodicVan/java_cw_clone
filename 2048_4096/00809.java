/**
 * Associates this request with the given queue. The request queue will be notified when this
 * request has finished.
 *
 * @return This Request object to allow for chaining.
 */
public Request<?> setRequestQueue(RequestQueue requestQueue){
    mRequestQueue = requestQueue;
    return this;
}