/**
 * Delivers error message to the ErrorListener that the Request was
 * initialized with.
 *
 * @param error Error details
 */
public void deliverError(VolleyError error){
    if (mErrorListener != null) {
        mErrorListener.onErrorResponse(error);
    }
}