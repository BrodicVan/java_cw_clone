/**
 * The value used for CORS in the access-control-allow-credentials header.
 * <p>
 * The default is false
 *
 * @param corsAllowCredentials the value used for CORS in the access-control-allow-credentials header
 */
public Configuration corsAllowCredentials(Boolean corsAllowCredentials){
    this.corsAllowCredentials = corsAllowCredentials;
    return this;
}