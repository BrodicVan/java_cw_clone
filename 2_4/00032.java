/**
 * Get the optional string associated with an index.
 * The defaultValue is returned if the key is not found.
 *
 * @param index The index must be between 0 and length() - 1.
 * @param defaultValue     The default value.
 * @return      A String value.
 */
public String optString(int index, String defaultValue){
    Object o = opt(index);
    return o != null ? o.toString() : defaultValue;
}