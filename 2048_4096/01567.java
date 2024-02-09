/**
 * Set the file name generator for log file.
 *
 * @param fileNameGenerator the file name generator for log file
 * @return the builder
 */
public Builder fileNameGenerator(FileNameGenerator fileNameGenerator){
  this.fileNameGenerator = fileNameGenerator;
  return this;
}