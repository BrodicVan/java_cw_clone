/**
 * Get the text up but not including the specified character or the
 * end of line, whichever comes first.
 * @param  d A delimiter character.
 * @return   A string.
 */
public String nextTo(char d) throws JSONException{
    StringBuffer sb = new StringBuffer();
    for (;;) {
        char c = next();
        if (c == d || c == 0 || c == '\n' || c == '\r') {
            if (c != 0) {
                back();
            }
            return sb.toString().trim();
        }
        sb.append(c);
    }
}