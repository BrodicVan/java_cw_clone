/**
 * Inserts a Boolean value into the mapping of this Bundle, replacing
 * any existing value for the given key.  Either key or value may be null.
 *
 * @param key a String, or null
 * @param value a Boolean, or null
 * @return this
 */
public Bundler putBoolean(String key, boolean value){
  bundle.putBoolean(key, value);
  return this;
}