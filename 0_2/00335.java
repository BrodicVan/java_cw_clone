/**
 * Returns the unique instance of the <code>AbstractEntityFactory</code>
 * @return an instance of <code>AbstractEntityFactory</code>
 */
public synchronized static AbstractEntityFactory getInstance(){
	if (instance == null) {
		instance = new AbstractEntityFactory() ;
	}
	return instance ;
}