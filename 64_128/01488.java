/**
 * Gets an instance of the class library.
 *
 * @return instance
 */
public static synchronized Tesseract getInstance(){
    if (instance == null) {
        instance = new Tesseract();
    }

    return instance;
}