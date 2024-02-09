/**
 * Defines task timeout since task execution start moment
 *
 * @param timeout - timeout of task
 * @param unit - time unit
 * @return self instance
 */
public WorkerOptions taskTimeout(long timeout, TimeUnit unit){
    this.taskTimeout = unit.toMillis(timeout);
    return this;
}