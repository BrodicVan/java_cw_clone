/**
 * Creates a new network dispatcher thread.  You must call {@link #start()}
 * in order to begin processing.
 *
 * @param queue Queue of incoming requests for triage
 * @param network Network interface to use for performing requests
 * @param cache Cache interface to use for writing responses to cache
 * @param delivery Delivery interface to use for posting responses
 */
public NetworkDispatcher(BlockingQueue<Request<?>> queue,
        Network network, Cache cache,
        ResponseDelivery delivery){
    mQueue = queue;
    mNetwork = network;
    mCache = cache;
    mDelivery = delivery;
}