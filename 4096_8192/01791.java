/**
 * <p>Client Netty worker thread pool size for handling requests and response.  These threads handle deserializing and serialising HTTP requests and responses and some other fast logic.</p>
 *
 * <p>Default is 5 threads</p>
 *
 * @param clientNioEventLoopThreadCount Client Netty worker thread pool size
 */
public Configuration clientNioEventLoopThreadCount(Integer clientNioEventLoopThreadCount){
    this.clientNioEventLoopThreadCount = clientNioEventLoopThreadCount;
    return this;
}