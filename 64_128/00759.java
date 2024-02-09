/**
 * Add or update an environment variable
 * 
 * @param key Key of the environment variable
 * @param value Value of the environment variable
 * @return This Builder object for method chaining
 */
public Builder addEnvironment(String key, String value){
    environment.put(key, value);
    return this;
}