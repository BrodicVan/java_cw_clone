/** Sets the enable state of the composite's children, recursively. */
public static void recursiveSetEnabled(Composite composite, boolean enabled){
	for(Control control : composite.getChildren() ) {
		if(control instanceof Composite) {
			recursiveSetEnabled((Composite) control, enabled);
		}
		control.setEnabled(enabled);
	}
}