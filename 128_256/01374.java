/**
 * Creates arguments for a browse fragment.
 *
 * @param args The Bundle to place arguments into, or null if the method
 *        should return a new Bundle.
 * @param title The title of the BrowseSupportFragment.
 * @param headersState The initial state of the headers of the
 *        BrowseSupportFragment. Must be one of {@link #HEADERS_ENABLED}, {@link
 *        #HEADERS_HIDDEN}, or {@link #HEADERS_DISABLED}.
 * @return A Bundle with the given arguments for creating a BrowseSupportFragment.
 */
public static Bundle createArgs(Bundle args, String title, int headersState){
    if (args == null) {
        args = new Bundle();
    }
    args.putString(ARG_TITLE, title);
    args.putInt(ARG_HEADERS_STATE, headersState);
    return args;
}