/**
 * <code>repeated string data = 5;</code>
 *
 * @param value The data to add.
 * @return This builder for chaining.
 */
public Builder addData(
  java.lang.String value){
  if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
  data_.add(value);
  onChanged();
  return this;
}