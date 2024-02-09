/* Get instance of singleton class. */
public static CallHandler getInstance(){
	if (instance == null) {
		instance = new CallHandler();
	}
	return instance;
}