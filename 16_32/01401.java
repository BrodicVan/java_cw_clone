/**
 * Constructor for the Settings/Config file.
 * Note: The resource must be in the same package or sub package
 * as this. If in a sub directory the resource parameter
 * is the path to it from this class file.
 * @param String resource
 * @param File out
 */
public SettingsHandler(String resource, File out){
	this.resource = resource;
	this.out = out;
}