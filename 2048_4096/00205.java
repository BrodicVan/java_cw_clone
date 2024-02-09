/**
 * <pre>
 * 消息头
 * </pre>
 *
 * <code>.Head head = 1;</code>
 */
public Builder setHead(
    Head.Builder builderForValue){
  if (headBuilder_ == null) {
    head_ = builderForValue.build();
    onChanged();
  } else {
    headBuilder_.setMessage(builderForValue.build());
  }

  return this;
}