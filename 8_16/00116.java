/**
 * Creates a new sample.
 *
 * @param bytesTransfered The total number of bytes transferred.
 * @param timestamp       A point in time, in milliseconds.
 */
public Sample(long bytesTransfered, long timestamp){
    this.bytesTransfered = bytesTransfered;
    this.timestamp = timestamp;
}