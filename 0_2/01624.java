/**
 * Constructor that takes an existing DES key.
 * @param original - the data to encrypt/decrypt
 * @param key - the DES key to use for encryption/decryption
 * */
public DESEncryption(long original, DESKey key){
   this.original = original;
   this.key = key;
}