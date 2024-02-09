// Exchanges |value| with |exchanger|, converting InterruptedExceptions to
// RuntimeExceptions (since we expect never to see these).
private static <T> T exchange(Exchanger<T> exchanger, T value){
  try {
    return exchanger.exchange(value);
  } catch (InterruptedException e) {
    throw new RuntimeException(e);
  }
}