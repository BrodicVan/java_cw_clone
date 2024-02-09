/**
 * Create collector server.
 *
 * @param consumer
 * @param thriftReceiver
 */
public CollectorServer(MessageConsumer consumer, MessageReceiver thriftReceiver, MessageReceiver kafkaReceiver){
    this.consumer = consumer;
    this.thriftReceiver = thriftReceiver;
    this.kafkaReceiver = kafkaReceiver;
}