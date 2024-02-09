/**
 * Basic constructor.
 */
public Response( String status, String mimeType, InputStream data ){
	this.status = status;
	this.mimeType = mimeType;
	this.data = data;
}