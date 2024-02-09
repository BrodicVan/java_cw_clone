/**
 * @see BaseDownloadTask#setCallbackProgressMinInterval(int)
 */
public FileDownloadQueueSet setCallbackProgressMinInterval(int minIntervalMillis){
    this.callbackProgressMinIntervalMillis = minIntervalMillis;
    return this;
}