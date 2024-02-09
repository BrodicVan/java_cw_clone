/**
 * Constructor.
 *
 * @param voyageNumber
 * @param from
 * @param to
 * @param loadTime
 * @param unloadTime
 */
public LegDTO(final String voyageNumber, final String from, final String to, Date loadTime, Date unloadTime){
  this.voyageNumber = voyageNumber;
  this.from = from;
  this.to = to;
  this.loadTime = loadTime;
  this.unloadTime = unloadTime;
}