/**
 * Get an optional JSONObject associated with a key.
 * It returns null if there is no such key, or if its value is not a
 * JSONObject.
 *
 * @param key   A key string.
 * @return      A JSONObject which is the value.
 */
public JSONObject optJSONObject(String key){
    Object o = opt(key);
    return o instanceof JSONObject ? (JSONObject)o : null;
}