/**
 * Construct a ReflectionInterface.
 *
 * @param apiKey The API key
 * @param sharedSecret The Shared Secret
 * @param transport The Transport interface
 */
public ReflectionInterface(
    String apiKey,
    String sharedSecret,
    Transport transport
){
    this.apiKey = apiKey;
    this.sharedSecret = sharedSecret;
    this.transport = transport;
}