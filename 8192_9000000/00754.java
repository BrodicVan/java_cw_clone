/**
 * Assign a function for producing a conflict error message when contains value with the same key.
 * <p>
 * function arguments are 1st is saved value and 2nd is target value.
 *
 * @param conflictMessageProducer
 *          A function for producing a conflict error message
 *
 * @return a conflict error message
 *
 * @since 3.5.0
 */
public StrictMap<V> conflictMessageProducer(BiFunction<V, V, String> conflictMessageProducer){
  this.conflictMessageProducer = conflictMessageProducer;
  return this;
}