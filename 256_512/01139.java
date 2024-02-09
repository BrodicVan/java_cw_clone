/**
 * JastAdd-internal setter for lexeme ID using the Beaver parser.
 * @apilevel internal
 * @ast method 
 * 
 */
public void setID(beaver.Symbol symbol){
  if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
  tokenString_ID = (String)symbol.value;
  IDstart = symbol.getStart();
  IDend = symbol.getEnd();
}