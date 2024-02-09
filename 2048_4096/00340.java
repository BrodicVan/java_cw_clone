/**
 * <code>repeated string attrnames = 1;</code>
 */
public Builder addAttrnamesBytes(
    com.google.protobuf.ByteString value){
  if (value == null) {
    throw new NullPointerException();
  }
  ensureAttrnamesIsMutable();
  attrnames_.add(value);
  onChanged();
  return this;
}