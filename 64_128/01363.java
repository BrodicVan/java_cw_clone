/**
 * Writes chars from a <code>char[]</code> to bytes on an
 * <code>OutputStream</code>.
 * <p>
 * This method uses {@link String#String(char[])} and
 * {@link String#getBytes()}.
 * 
 * @param data  the char array to write, do not modify during output,
 * null ignored
 * @param output  the <code>OutputStream</code> to write to
 * @throws NullPointerException if output is null
 * @throws IOException if an I/O error occurs
 * @since 1.1
 */
public static void write(char[] data, OutputStream output)
        throws IOException{
    if (data != null) {
        output.write(new String(data).getBytes());
    }
}