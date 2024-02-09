/**
 * <p>the value used for CORS in the access-control-allow-headers and access-control-expose-headers headers.</p>
 * <p>In addition to this default value any headers specified in the request header access-control-request-headers also get added to access-control-allow-headers and access-control-expose-headers headers in a CORS response.</p>
 * <p>The default is ""</p>
 *
 * @param corsAllowHeaders the value used for CORS in the access-control-allow-headers and access-control-expose-headers headers
 */
public Configuration corsAllowHeaders(String corsAllowHeaders){
    this.corsAllowHeaders = corsAllowHeaders;
    return this;
}