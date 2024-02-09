/**
 * Sets the location of the status update in latitude and longitude. Latitude values must be between -90.0 (south) and +90.0
 * (north). Longitude values must be between -180.0 (west) and +180.0 (east).
 * 
 * For example, latitude=51.502 and longitude=-0.126 are the coordinates for Westminster, London.
 * 
 * @param latitude The latitude element of the location. Must be between -90.0 and +90.0, where positive values are north
 *        and negative values are south.
 * @param longitude The longitude element of the location. Must be between -180.0 and +180.0, where positive values are east
 *        and negative values are west.
 * @return The {@link StatusDetails} object
 */
public StatusDetails setLocation(float latitude, float longitude){
    this.latitude = latitude;
    this.longitude = longitude;
    return this;
}