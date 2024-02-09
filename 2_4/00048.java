/**
 * CalendarEntry
 *
 * @param 
 * @return 
 */
public CalendarEntry(UUID uuid, Integer id, Date datetime, String status, String descr, int duration ){
	this.uuid = uuid;
	this.id = id;
	this.datetime = datetime;
	this.status = status;
	this.descr = descr;
	this.duration = duration;
}