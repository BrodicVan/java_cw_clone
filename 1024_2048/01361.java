/**
 * Suppress the comment that contains the current date when storing the properties.
 *
 * @param suppressDate whether to suppress the comment that contains the current date
 * @return the builder
 */
public OrderedPropertiesBuilder withSuppressDateInComment(boolean suppressDate){
    
    this.suppressDate = suppressDate;
    return this;
}