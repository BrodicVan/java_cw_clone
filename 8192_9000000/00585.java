/**
 * Provide a custom thread pool to EventBus used for async and background event delivery. This is an advanced
 * setting to that can break things: ensure the given ExecutorService won't get stuck to avoid undefined behavior.
 */
public EventBusBuilder executorService(ExecutorService executorService){
    this.executorService = executorService;
    return this;
}