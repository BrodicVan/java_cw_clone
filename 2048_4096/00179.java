/**
 * Convert the given object to string with each line indented by 4 spaces (except the first line).
 */
private String toIndentedString(Object o){
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}