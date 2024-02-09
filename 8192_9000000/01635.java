/**
 * Enable or disable the TELNET BINARY option on input.
 *
 * @param inBinary
 *            true to require the client to emit binary
 * @return this object
 */
public NettyHttpTelnetTtyBootstrap setInBinary(boolean inBinary){
    this.inBinary = inBinary;
    return this;
}