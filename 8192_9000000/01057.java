/**
 * Spawns a server and waits for the redirectUri to be called.
 *
 * @param hubConfig Configuration object holding parameters required by {@link AuthFlow}
 * @param redirectUriConsumer A callback invoked with the redirectUri, as soon as the server has started
 */
public AuthFlowTask(HubConfig hubConfig, AuthFlowContext authFlowContext, Consumer<URI> redirectUriConsumer){
	this.hubConfig = hubConfig;
	this.authFlowContext = authFlowContext;
	this.redirectUriConsumer = redirectUriConsumer;
}