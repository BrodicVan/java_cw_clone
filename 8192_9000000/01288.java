/**
 * Add extra field data value to intent being built up
 *
 * @param fieldName
 * @param value
 * @return this builder
 */
public Builder add(String fieldName, ArrayList<? extends Parcelable> value){
    intent.putParcelableArrayListExtra(fieldName, value);
    return this;
}