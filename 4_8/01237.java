/**
 * Constructs a range object given a start and end index into the document.
 * 
 * @param start Start of the range.
 * @param end End of the range.
 */
public Range(int start, int end){
  // TODO(scovitz): Figure out why Spelly generates zero length range here.
//    if (end - start <= 0) {
//      throw new RuntimeException("Range length cannot be zero or negative.");
//    } else {
    this.start = start;
    this.end = end;
//    }
}