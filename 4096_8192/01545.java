/**
 * Inserts a long value into the mapping of this Bundle, replacing
 * any existing value for the given key.
 *
 * @param key a String, or null
 * @param value a long
 * @return this
 */
public Bundler putLong(String key, long value){
  bundle.putLong(key, value);
  return this;
}