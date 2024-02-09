/**
 * Constructs and returns a new <code>byte[]</code> that contains
 * the written contents exactly (that is, with no extra unwritten
 * bytes at the end).
 *
 * @see #getArray
 *
 * @return non-null; an appropriately-constructed array
 */
public byte[] toByteArray(){
    byte[] result = new byte[cursor];
    System.arraycopy(data, 0, result, 0, cursor);
    return result;
}