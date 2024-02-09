/**
 * Creates a new channel data object with data
 * @param uniqueId - unique message id
 * @param message - message data
 * @param timestamp - message timestamp
 */
public ChannelData(byte[] uniqueId, XByteBuffer message, long timestamp){
    this.uniqueId = uniqueId;
    this.message = message;
    this.timestamp = timestamp;
}