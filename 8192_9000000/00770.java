/**
 * Defines workers amount used to execute tasks.
 * Default is <code>1</code>.
 * 
 * @param workers - workers amount
 * @return self instance
 */
public WorkerOptions workers(int workers){
    this.workers = workers;
    return this;
}