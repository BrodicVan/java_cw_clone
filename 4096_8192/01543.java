/**
 * Inserts a String value into the mapping of this Bundle, replacing
 * any existing value for the given key.  Either key or value may be null.
 *
 * @param key a String, or null
 * @param value a String, or null
 * @return this
 */
public Bundler putString(String key, String value){
  bundle.putString(key, value);
  return this;
}