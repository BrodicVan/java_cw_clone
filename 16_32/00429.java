/**
 * Configure the minimum amount of time that has to pass since the first launch before
 * <code>isOver()</code> will return true;
 * @param minTime time in milliseconds
 * @return the object for method chaining.
 */
public TrialPeriod withMinTime(long minTime){
  this.minTime=minTime;
  return this;
}