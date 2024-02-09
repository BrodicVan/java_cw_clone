/**
 * Publishes an event to the ring buffer.  It handles
 * claiming the next sequence, getting the current (uninitialized) 
 * event from the ring buffer and publishing the claimed sequence
 * after translation.
 * 
 * @param translator The user specified translation for the event
 */
public void publishEvent(final EventTranslator<E> translator){
    final long sequence = ringBuffer.next();
    translateAndPublish(translator, sequence);
}