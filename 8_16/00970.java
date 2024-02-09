/**
 * Parses headers from the given stream.  Headers with the same name are not
 * combined.
 * 
 * @param is the stream to read headers from
 * 
 * @return an array of headers in the order in which they were parsed
 * 
 * @throws IOException if an IO error occurs while reading from the stream
 * @throws HttpException if there is an error parsing a header value
 * 
 * @deprecated use #parseHeaders(InputStream, String)
 */
public static Header[] parseHeaders(InputStream is) throws IOException, HttpException{
    LOG.trace("enter HeaderParser.parseHeaders(InputStream, String)");
    return parseHeaders(is, "US-ASCII");
}