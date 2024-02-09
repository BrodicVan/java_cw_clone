/**
 * Chainable configuration option.
 * 
 * @param learningRate
 *            New value of initial learning rate.
 * @return This, so other configurations can be chained.
 */
public ParallelOnlineLinearRegression learningRate(double learningRate){
	this.learningRate = learningRate;
	return this;
}