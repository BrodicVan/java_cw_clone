/**
 * @param lower lower bound inclusive
 * @param upper upper bound inclusive
 */
public UniformDistribution(@JsonProperty("lower") int lower, @JsonProperty("upper") int upper){
  this.lower = lower;
  this.upper = upper;
}