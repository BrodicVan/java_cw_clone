/**
 * If set, then missing integers and doubles will be returned as
 * {@link org.omancode.rmt.cellreader.CellReaders#MISSING_VALUE_INTEGER} or
 * {@link org.omancode.rmt.cellreader.CellReaders#MISSING_VALUE_DOUBLE}
 * instead.
 * 
 * @param convertMissing
 *            true to convert missing ints/doubles
 * @return this
 */
public CBuildNarrowed setConvertMissing(boolean convertMissing){
	this.convertMissing = convertMissing;
	return this;
}