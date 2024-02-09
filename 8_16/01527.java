/**
 * Constructor.
 * 
 * @param source
 *            url of file to parse
 * @param progress
 *            callback for sending progress information
 */
protected AVatsimParser(String source, VatsimProgressUpdate progress){
    this.source = source;
    this.progress = progress;
}