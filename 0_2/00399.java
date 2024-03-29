/**
 * Get an optional boolean associated with a key.
 * It returns the defaultValue if there is no such key, or if it is not
 * a Boolean or the String "true" or "false" (case insensitive).
 *
 * @param key              A key string.
 * @param defaultValue     The default.
 * @return      The truth.
 */
public boolean optBoolean(String key, boolean defaultValue){
    try {
        return getBoolean(key);
    } catch (Exception e) {
        return defaultValue;
    }
}