/**
 * The RequestMatcher that triggers log out to occur. In most circumstances users will
 * use {@link #logoutUrl(String)} which helps enforce good practices.
 * @param logoutRequestMatcher the RequestMatcher used to determine if logout should
 * occur.
 * @return the {@link LogoutConfigurer} for further customization
 * @see #logoutUrl(String)
 */
public LogoutConfigurer<H> logoutRequestMatcher(RequestMatcher logoutRequestMatcher){
	this.logoutRequestMatcher = logoutRequestMatcher;
	return this;
}