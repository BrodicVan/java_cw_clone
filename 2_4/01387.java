/**
 * Sigma controls the variance on the prior / penalty term. 1.0 is a
 * reasonable value for large problems, bigger sigma means LESS
 * smoothing. Zero sigma is a special indicator that no smoothing is to
 * be done. <p/> Iterations determines the maximum number of iterations
 * the optimization code can take before stopping.
 */
public Factory(double sigma, int iterations, FeatureExtractor<I, F> featureExtractor){
	this.sigma = sigma;
	this.iterations = iterations;
	this.featureExtractor = featureExtractor;
}