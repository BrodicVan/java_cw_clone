/**
 * <code>optional float negative_slope = 1 [default = 0];</code>
 *
 * <pre>
 * Allow non-zero slope for negative inputs to speed up optimization
 * Described in:
 * Maas, A. L., Hannun, A. Y., &amp; Ng, A. Y. (2013). Rectifier nonlinearities
 * improve neural network acoustic models. In ICML Workshop on Deep Learning
 * for Audio, Speech, and Language Processing.
 * </pre>
 */
public Builder clearNegativeSlope(){
	bitField0_ = (bitField0_ & ~0x00000001);
	negativeSlope_ = 0F;
	onChanged();
	return this;
}