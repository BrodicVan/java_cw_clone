/*
 * (non-Javadoc)
 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
 */
public void start(BundleContext context) throws Exception{
	super.start(context);
	plugin = this;
/*
	ICommandService commandService = (ICommandService)plugin.getWorkbench().getService(ICommandService.class);
	commandService.addExecutionListener(new IExecutionListener() {
		public void notHandled(final String commandId, final NotHandledException exception) {}
		public void postExecuteFailure(final String commandId, final ExecutionException exception) {}
		public void postExecuteSuccess(final String commandId, final Object returnValue) {}
		public void preExecute( final String commandId, final ExecutionEvent event ) {
			if (commandId.equals("org.eclipse.ui.file.save")) {
				IEditorPart editor = HandlerUtil.getActiveEditor(event);
				if (editor instanceof Editor) {
					((Editor)editor).updateMarkers();
				}
			}
		}
	});*/
}