/**
 * The file path used to save persisted expectations as json, which is updated whenever the expectation state is updated (i.e. add, clear, expires, etc.)
 * <p>
 * The default is "persistedExpectations.json"
 *
 * @param persistedExpectationsPath file path used to save persisted expectations as json
 */
public Configuration persistedExpectationsPath(String persistedExpectationsPath){
    this.persistedExpectationsPath = persistedExpectationsPath;
    return this;
}