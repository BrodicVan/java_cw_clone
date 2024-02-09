/**
 * The domain name for auto-generate TLS certificates
 * <p>
 * The default is "localhost"
 *
 * @param sslCertificateDomainName domain name for auto-generate TLS certificates
 */
public Configuration sslCertificateDomainName(String sslCertificateDomainName){
    this.sslCertificateDomainName = sslCertificateDomainName;
    return this;
}