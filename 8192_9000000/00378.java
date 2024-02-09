/**
 * Create a new test instance
 *
 * @param factory               The task factory, used to create new test items
 * @param expectedExecutionTime The expected time needed to run the task 1 time, in milli seconds
 */
public TaskTest(final IntFunction<T> factory, final int expectedExecutionTime){
  this.factory = factory;
  this.expectedExecutionTime = expectedExecutionTime;
}