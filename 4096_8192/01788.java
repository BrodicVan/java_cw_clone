/**
 * If true the BinaryProxyListener is called before a response is received from the
 * remote host. This enables the proxying of messages without a response.
 * <p>
 * The default is false
 *
 * @param forwardBinaryRequestsWithoutWaitingForResponse target value
 */
public Configuration forwardBinaryRequestsWithoutWaitingForResponse(Boolean forwardBinaryRequestsWithoutWaitingForResponse){
    this.forwardBinaryRequestsWithoutWaitingForResponse = forwardBinaryRequestsWithoutWaitingForResponse;
    return this;
}