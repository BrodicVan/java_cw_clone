/**
 * Get the int value associated with a key. If the number value is too
 * large for an int, it will be clipped.
 *
 * @param key   A key string.
 * @return      The integer value.
 * @throws   JSONException if the key is not found or if the value cannot
 *  be converted to an integer.
 */
public int getInt(String key) throws JSONException{
    Object o = get(key);
    return o instanceof Number ?
            ((Number)o).intValue() : (int)getDouble(key);
}