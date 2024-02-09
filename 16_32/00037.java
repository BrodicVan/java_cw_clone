/**
 * Reads the NTP time stamp at the given offset in the buffer and returns it
 * as a system time (milliseconds since January 1, 1970).
 */
private long readTimeStamp(byte[] buffer, int offset){
    long seconds = read32(buffer, offset);
    long fraction = read32(buffer, offset + 4);
    return ((seconds - OFFSET_1900_TO_1970) * 1000) + ((fraction * 1000L) / 0x100000000L);
}