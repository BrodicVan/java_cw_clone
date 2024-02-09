/**
 * Basic constructor.
 */
public Response( String status, String mimeType, StreamSource data ){
	this.status = status;
	this.mimeType = mimeType;
	this.data = data;
}