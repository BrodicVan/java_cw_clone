/**
 * Returns a new Token object, by default. However, if you want, you can
 * create and return subclass objects based on the value of ofKind. Simply add
 * the cases to the switch for all those special cases. For example, if you
 * have a subclass of Token called IDToken that you want to create if ofKind
 * is ID, simlpy add something like :
 * 
 * case MyParserConstants.ID : return new IDToken();
 * 
 * to the following switch statement. Then you can cast matchedToken variable
 * to the appropriate type and use it in your lexical actions.
 */
public static final Token newToken(int ofKind){
  switch (ofKind) {
  default:
    return new Token();
  }
}