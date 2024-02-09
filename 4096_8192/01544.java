/**
 * Inserts a char value into the mapping of this Bundle, replacing
 * any existing value for the given key.
 *
 * @param key a String, or null
 * @param value a char, or null
 * @return this
 */
public Bundler putChar(String key, char value){
  bundle.putChar(key, value);
  return this;
}