/**
 * This method initializes jScrollPane	
 * 	
 * @return javax.swing.JScrollPane	
 */
private JScrollPane getJScrollPane(){
	if (jScrollPane == null) {
		jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(getJTable());
	}
	return jScrollPane;
}