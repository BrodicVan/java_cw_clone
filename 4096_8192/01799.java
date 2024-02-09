/**
 * <p>The required username for proxy authentication to MockServer</p>
 * <p><strong>Note:</strong> <a target="_blank" href="https://www.oracle.com/java/technologies/javase/8u111-relnotes.html">8u111 Update Release Notes</a> state that the Basic authentication scheme has been deactivated when setting up an HTTPS tunnel.  To resolve this clear or set to an empty string the following system properties: <code class="inline code">jdk.http.auth.tunneling.disabledSchemes</code> and <code class="inline code">jdk.http.auth.proxying.disabledSchemes</code>.</p>
 * <p>
 * The default is ""
 *
 * @param proxyAuthenticationUsername required username for proxy authentication to MockServer
 */
public Configuration proxyAuthenticationUsername(String proxyAuthenticationUsername){
    this.proxyAuthenticationUsername = proxyAuthenticationUsername;
    return this;
}