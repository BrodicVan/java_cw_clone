/**
 * Use HTTP proxy (i.e. via Host header) for all outbound / forwarded requests
 * <p>
 * The default is null
 *
 * @param forwardHttpProxy host and port for HTTP proxy (i.e. via Host header) for all outbound / forwarded requests
 */
public Configuration forwardHttpProxy(InetSocketAddress forwardHttpProxy){
    this.forwardHttpProxy = forwardHttpProxy;
    return this;
}