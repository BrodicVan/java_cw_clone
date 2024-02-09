/**
 * A static factory method. This method validates the arguments by {@link
 * ByteArrays#validateBounds(byte[], int, int)}, which may throw exceptions undocumented here.
 *
 * @param rawData rawData
 * @param offset offset
 * @param length length
 * @return a new Ssh2KexInitPacket object.
 * @throws IllegalRawDataException if parsing the raw data fails.
 */
public static Ssh2KexInitPacket newPacket(byte[] rawData, int offset, int length)
    throws IllegalRawDataException{
  ByteArrays.validateBounds(rawData, offset, length);
  return new Ssh2KexInitPacket(rawData, offset, length);
}