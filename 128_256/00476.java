/**
 * Closes this output stream and releases any system resources
 * associated with the stream.
 *
 * @exception  IOException  if an I/O error occurs.
 * @throws Zip64RequiredException if the archive's size exceeds 4
 * GByte or there are more than 65535 entries inside the archive
 * and {@link #setUseZip64} is {@link Zip64Mode#Never}.
 */
@Override
public void close() throws IOException{
    if (!finished) {
        finish();
    }
    destroy();
}