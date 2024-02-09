/**
 * @see com.lmax.disruptor.EventSink#publishEvents(com.lmax.disruptor.EventTranslatorThreeArg, int, int, Object[], Object[], Object[])
 * com.lmax.disruptor.EventSink#publishEvents(com.lmax.disruptor.EventTranslatorThreeArg, int, int, A[], B[], C[])
 */
@Override
public <A, B, C> void publishEvents(
    final EventTranslatorThreeArg<E, A, B, C> translator, final int batchStartsAt, final int batchSize, final A[] arg0, final B[] arg1, final C[] arg2){
    checkBounds(arg0, arg1, arg2, batchStartsAt, batchSize);
    final long finalSequence = sequencer.next(batchSize);
    translateAndPublishBatch(translator, arg0, arg1, arg2, batchStartsAt, batchSize, finalSequence);
}