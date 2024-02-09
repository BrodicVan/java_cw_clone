/**
 * Equivalent to <code>alpha</code>, but controls the smoothing of the trend instead of the data
 *
 * @param beta a double between 0-1 inclusive, controls trend smoothing
 *
 * @return The builder to continue chaining
 */
public HoltLinearModelBuilder beta(double beta){
    this.beta = beta;
    return this;
}