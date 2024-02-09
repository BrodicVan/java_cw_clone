/**
 * Set the arguments used for the prepared statement
 *
 * @param args The strings used to replace "?" in the SELECT query statement
 * @return The QueryBuilder itself
 */
public QueryBuilder args(String... args){
  this.args = args;
  return this;
}