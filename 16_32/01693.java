/**
 * Try to show a dialog which requires that the user is logged in. If the
 * user is logged in then the specified dialog will be shown, otherwise the
 * standard authentication (DIALOG_NOT_AUTHENTICATED) dialog will be shown.
 * @param dialog
 */
private void tryShowAuthenticatedDialog(int dialog){
	if(isLoggedIn()) {
		showDialog(dialog);
	} else {
		showDialog(DIALOG_NOT_AUTHENTICATED);
	}
}