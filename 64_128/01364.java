/**
 * Read characters from an input character stream.
 * This implementation guarantees that it will read as many characters
 * as possible before giving up; this may not always be the case for
 * subclasses of {@link Reader}.
 * 
 * @param input where to read input from
 * @param buffer destination
 * @param offset inital offset into buffer
 * @param length length to read, must be >= 0
 * @return actual length read; may be less than requested if EOF was reached
 * @throws IOException if a read error occurs
 * @since 2.2
 */
public static int read(Reader input, char[] buffer, int offset, int length) throws IOException{
    if (length < 0) {
        throw new IllegalArgumentException("Length must not be negative: " + length);
    }
    int remaining = length;
    while (remaining > 0) {
        int location = length - remaining;
        int count = input.read(buffer, offset + location, remaining);
        if (EOF == count) { // EOF
            break;
        }
        remaining -= count;
    }
    return length - remaining;
}