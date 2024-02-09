/**
 * Returns a random boolean from a Bernoulli distribution with success
 * probability <em>p</em>.
 *
 * @param  p the probability of returning {@code true}
 * @return {@code true} with probability {@code p} and
 *         {@code false} with probability {@code p}
 * @throws IllegalArgumentException unless {@code p >= 0.0} and {@code p <= 1.0}
 */
public static boolean bernoulli(double p){
    if (!(p >= 0.0 && p <= 1.0))
        throw new IllegalArgumentException("Probability must be between 0.0 and 1.0");
    return uniform() < p;
}