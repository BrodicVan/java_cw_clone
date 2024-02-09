/**
 * {@inheritDoc}
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode(){
   final int prime = 31;
   int result = 1;
   result = prime * result + ((id == null) ? 0 : id.hashCode());
   return result;
}