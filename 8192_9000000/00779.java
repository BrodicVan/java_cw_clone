/**
 * Defines custom ExecutorService to execute tasks.
 * {@link Config#setExecutor(ExecutorService)} is used by default.
 * 
 * @param executorService - custom ExecutorService
 * @return self instance
 */
public WorkerOptions executorService(ExecutorService executorService){
    this.executorService = executorService;
    return this;
}