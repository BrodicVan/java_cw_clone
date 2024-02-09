/**
 *
 * @param username The username from the web form
 * @param passwordDigest The password digest
 */
public WebFormAuthenticationDto(String username, String passwordDigest){
  this.username = username;
  this.passwordDigest = passwordDigest;
}