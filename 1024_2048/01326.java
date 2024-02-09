/**
 * <code>string content = 5;</code>
 */
public Builder setContentBytes(
    com.google.protobuf.ByteString value){
  if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

  content_ = value;
  onChanged();
  return this;
}