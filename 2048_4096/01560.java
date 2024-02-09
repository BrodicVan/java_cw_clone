/**
 * Set the writer to write log into log file.
 *
 * @param writer the writer to write log into log file
 * @return the builder
 * @since 1.11.0
 */
public Builder writer(Writer writer){
  this.writer = writer;
  return this;
}