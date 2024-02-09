/**
 * Add extra field data value to intent being built up
 *
 * @param fieldName
 * @param value
 * @return this builder
 */
public Builder add(String fieldName, int value){
    intent.putExtra(fieldName, value);
    return this;
}