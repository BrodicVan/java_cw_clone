/**
 * Converts a boolean and put it in a byte array.
 * @param bool the integer
 * @param data the byte buffer in which the boolean will be placed
 * @param offset the offset in the byte array
 * @return the byte array
 */
public static byte[] toBytes(boolean bool, byte[] data, int offset){
    data[offset] = (byte)(bool?1:0);
    return data;
}