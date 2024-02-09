/**
 * <p>
 * Resets the input buffer position to just before the last byte read, and
 * returns a result indicating to skip the last byte.
 * </p>
 * 
 * @param in The input buffer
 * @return CoderResult.malformedForLength(1);
 */
private CoderResult malformed(ByteBuffer in){
    in.position(in.position() - 1);
    return CoderResult.malformedForLength(1);
}