/**
 * <p>The path to the json file used to initialize expectations in MockServer at startup, if set MockServer will load this file and initialise expectations for each item in the file when is starts.</p>
 * <p>The expected format of the file is a JSON array of expectations, as per the <a target="_blank" href="https://app.swaggerhub.com/apis/jamesdbloom/mock-server-openapi/5.15.x#/Expectations" target="_blank">REST API format</a></p>
 * <p>To watch multiple files use a file globs as documented here: https://mock-server.com/mock_server/initializing_expectations.html#expectation_initializer_json_glob_patterns</p>
 *
 * @param initializationJsonPath path to the json file used to initialize expectations in MockServer at startup
 */
public Configuration initializationJsonPath(String initializationJsonPath){
    this.initializationJsonPath = initializationJsonPath;
    return this;
}