/**
 * Set @{@code ImageRequestBuilder} for drawees. Use it for post-processing, custom resize options etc.
 * Use {@link ImageViewer#createImageRequestBuilder()} to create its new instance.
 *
 * @return This Builder object to allow for chaining of calls to set methods
 */
public Builder setCustomImageRequestBuilder(ImageRequestBuilder customImageRequestBuilder){
    this.customImageRequestBuilder = customImageRequestBuilder;
    return this;
}