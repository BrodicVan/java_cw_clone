/**
 * <code>optional .net.plan99.payfile.QueryFiles query_files = 2;</code>
 */
public Builder setQueryFiles(
    net.plan99.payfile.Payfile.QueryFiles.Builder builderForValue){
  if (queryFilesBuilder_ == null) {
    queryFiles_ = builderForValue.build();
    onChanged();
  } else {
    queryFilesBuilder_.setMessage(builderForValue.build());
  }
  bitField0_ |= 0x00000002;
  return this;
}