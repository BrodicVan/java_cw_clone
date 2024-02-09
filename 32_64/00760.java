/**
 * Constructor.
 *
 * @param voyageNumber
 * @param fromUnLocode
 * @param toUnLocode
 * @param fromDate
 * @param toDate
 */
public TransitEdge(final String voyageNumber,
                   final String fromUnLocode,
                   final String toUnLocode,
                   final Date fromDate,
                   final Date toDate){
  this.voyageNumber = voyageNumber;
  this.fromUnLocode = fromUnLocode;
  this.toUnLocode = toUnLocode;
  this.fromDate = fromDate;
  this.toDate = toDate;
}