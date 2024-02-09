/**
 * Constructs CapturedData based on the given data.
 * 
 * @param values 32bit values as read from device
 * @param triggerPosition position of trigger as index of values array
 * @param rate sampling rate (may be set to <code>NOT_AVAILABLE</code>)
 * @param channels number of used channels
 * @param enabledChannels bit mask identifying used channels
 */
public CapturedData(int[] values, int triggerPosition, int rate, int channels, int enabledChannels){
	this.values = values;
	this.triggerPosition = triggerPosition;
	this.rate = rate;
	this.channels = channels;
	this.enabledChannels = enabledChannels;
}