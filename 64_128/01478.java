/**
 * Sets the recommended version to satisfy this constraint.
 * 
 * @param version The recommended version for this constraint, may be {@code null} if none.
 * @return This constraint for chaining, never {@code null}.
 */
public GenericVersionConstraint setVersion( Version version ){
    this.version = version;
    return this;
}