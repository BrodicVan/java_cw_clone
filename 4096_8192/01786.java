/**
 * Enable dynamic creation of Certificate Authority X509 certificate and private key.
 * <p>
 * Enable this property to increase the security of trusting the MockServer Certificate Authority X509 by ensuring a local dynamic value is used instead of the public value in the MockServer git repo.
 * <p>
 * These PEM files will be created and saved in the directory specified with configuration property directoryToSaveDynamicSSLCertificate.
 *
 * @param dynamicallyCreateCertificateAuthorityCertificate dynamic creation of Certificate Authority X509 certificate and private key.
 */
public Configuration dynamicallyCreateCertificateAuthorityCertificate(Boolean dynamicallyCreateCertificateAuthorityCertificate){
    this.dynamicallyCreateCertificateAuthorityCertificate = dynamicallyCreateCertificateAuthorityCertificate;
    return this;
}