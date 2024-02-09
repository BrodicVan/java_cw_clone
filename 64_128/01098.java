/**
 * <code>repeated .net.plan99.payfile.File files = 1;</code>
 */
public Builder addFiles(
    int index, net.plan99.payfile.Payfile.File.Builder builderForValue){
  if (filesBuilder_ == null) {
    ensureFilesIsMutable();
    files_.add(index, builderForValue.build());
    onChanged();
  } else {
    filesBuilder_.addMessage(index, builderForValue.build());
  }
  return this;
}