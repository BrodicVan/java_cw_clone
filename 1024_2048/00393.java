/**
 * Set {@link GenericDraweeHierarchyBuilder} for drawees inside viewer.
 * Use it for drawee customizing (e.g. failure image, placeholder, progressbar etc.)
 * N.B.! Due to zoom logic there is limitation of scale type which always equals FIT_CENTER. Other values will be ignored
 *
 * @return This Builder object to allow for chaining of calls to set methods
 */
public Builder setCustomDraweeHierarchyBuilder(GenericDraweeHierarchyBuilder customHierarchyBuilder){
    this.customHierarchyBuilder = customHierarchyBuilder;
    return this;
}