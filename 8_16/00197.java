/**
 * Get the optional JSONObject associated with an index.
 * Null is returned if the key is not found, or null if the index has
 * no value, or if the value is not a JSONObject.
 *
 * @param index The index must be between 0 and length() - 1.
 * @return      A JSONObject value.
 */
public JSONObject optJSONObject(int index){
    Object o = opt(index);
    return o instanceof JSONObject ? (JSONObject)o : null;
}