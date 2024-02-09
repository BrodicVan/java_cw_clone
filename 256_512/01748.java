/**
 *
 * @param advertised If <code>false</code>, no alive notifications will be announced for
 *                   this device and it will not appear in search responses.
 * @param byeByeBeforeFirstAlive If <code>true</code>, a byebye NOTIFY message will be send before the
 *                               first alive NOTIFY message.
 */
public DiscoveryOptions(boolean advertised, boolean byeByeBeforeFirstAlive){
    this.advertised = advertised;
    this.byeByeBeforeFirstAlive = byeByeBeforeFirstAlive;
}