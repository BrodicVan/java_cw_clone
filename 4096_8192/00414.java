/**
 * @param url
 * @param method
 */
public HttpServletRequestAuthWrapper(HttpServletRequest request, String url, String method){
    super(request);
    this.url = url;
    this.method = method;
}