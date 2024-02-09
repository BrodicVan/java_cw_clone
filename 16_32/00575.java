/**
 * Indicates that Twitter should pinpoint the location precisely when displaying it on a map. By default, Twitter will
 * display the status along with a map showing the general area where the tweet came from. If display coordinates is true,
 * however, it will display a map with a pin indicating the precise location of the status update.
 * 
 * @param displayCoordinates If true, will pinpoint the location of the status update.
 * @return The {@link StatusDetails} object
 */
public StatusDetails setDisplayCoordinates(boolean displayCoordinates){
    this.displayCoordinates = displayCoordinates;
    return this;
}