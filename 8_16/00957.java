/** Help | About action performed */
/** Overridden so we can exit when window is closed */
protected void processWindowEvent(WindowEvent e){
	super.processWindowEvent(e);
	if (e.getID() == WindowEvent.WINDOW_CLOSING) {
		System.exit(0);
	}
}