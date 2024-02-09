/**
 * Copy bytes from a large (over 2GB) <code>InputStream</code> to an
 * <code>OutputStream</code>.
 * <p>
 * This method uses the provided buffer, so there is no need to use a
 * <code>BufferedInputStream</code>.
 * <p>
 * 
 * @param input  the <code>InputStream</code> to read from
 * @param output  the <code>OutputStream</code> to write to
 * @param buffer the buffer to use for the copy
 * @return the number of bytes copied
 * @throws NullPointerException if the input or output is null
 * @throws IOException if an I/O error occurs
 * @since 2.2
 */
public static long copyLarge(InputStream input, OutputStream output, byte[] buffer)
        throws IOException{
    long count = 0;
    int n = 0;
    while (EOF != (n = input.read(buffer))) {
        output.write(buffer, 0, n);
        count += n;
    }
    return count;
}