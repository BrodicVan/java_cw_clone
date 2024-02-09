/**
 * Set the priority of request for sorting.<br>
 * Need a scheduler supporting priority.<br>
 * @see us.codecraft.webmagic.scheduler.PriorityScheduler
 *
 * @param priority priority
 * @return this
 */
@Experimental
public Request setPriority(long priority){
    this.priority = priority;
    return this;
}