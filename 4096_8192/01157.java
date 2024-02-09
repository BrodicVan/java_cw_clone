/**
 * Set the buffer containing the counters. Testing/internal purposes only.
 *
 * @param countersValuesBuffer The new counters buffer.
 * @return this for a fluent API.
 */
public CommonContext countersValuesBuffer(final UnsafeBuffer countersValuesBuffer){
    this.countersValuesBuffer = countersValuesBuffer;
    return this;
}