/**
 * Creates a new network response.
 *
 * @param statusCode the HTTP status code
 * @param data       Response body
 * @param charset    The response body charset, parse by http header
 */
public NetworkResponse(int statusCode, byte[] data, String charset){
    this.statusCode = statusCode;
    this.data = data;
    this.charset = charset;
}