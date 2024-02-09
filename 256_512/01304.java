/**
 * Set the accepted fling types, defaults to both being true.
 */
public Builder flingTypes(boolean allowUpwardsFling, boolean allowDownwardsFling){
    this.allowUpwardsFling = allowUpwardsFling;
    this.allowDownwardsFling = allowDownwardsFling;
    return this;
}