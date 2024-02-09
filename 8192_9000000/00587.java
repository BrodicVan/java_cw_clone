/**
 * By default, EventBus considers the event class hierarchy (subscribers to super classes will be notified).
 * Switching this feature off will improve posting of events. For simple event classes extending Object directly,
 * we measured a speed up of 20% for event posting. For more complex event hierarchies, the speed up should be
 * greater than 20%.
 * <p/>
 * However, keep in mind that event posting usually consumes just a small proportion of CPU time inside an app,
 * unless it is posting at high rates, e.g. hundreds/thousands of events per second.
 */
public EventBusBuilder eventInheritance(boolean eventInheritance){
    this.eventInheritance = eventInheritance;
    return this;
}