/**
 * By default, reading plaintext (unencrypted) files is not allowed when using a decryptor 
 * - in order to detect files that were not encrypted by mistake. 
 * However, the default behavior can be overriden by calling this method.
 * The caller should use then a different method to ensure encryption of files with sensitive data.
 * 
 * @return Builder
 */
public Builder withPlaintextFilesAllowed(){
  this.plaintextFilesAllowed  = true;
  return this;
}