/**
 * <pre>
 * 消息接收者id
 * </pre>
 *
 * <code>string toId = 5;</code>
 */
public Builder setToIdBytes(
    com.google.protobuf.ByteString value){
  if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
  
  toId_ = value;
  onChanged();
  return this;
}