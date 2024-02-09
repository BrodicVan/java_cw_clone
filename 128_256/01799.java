/**
 * Set the scheduler that should be used by SqlBrite to emit items.
 * A Scheduler is required for a few reasons, but the most important is that query
 * notifications
 * can trigger on the thread of your choice. The query can then be run without blocking the
 * main
 * thread or the thread which caused the trigger.
 *
 * <p>
 * Per default {@link Schedulers#io()} is used.
 * </p>
 *
 * @param scheduler The {@link Scheduler} on which items from {@link BriteDatabase#createQuery}
 * will be emitted.
 * @return the builder itself
 */
public Builder scheduler(Scheduler scheduler){
  this.scheduler = scheduler;
  return this;
}