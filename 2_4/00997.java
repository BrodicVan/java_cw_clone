/**
 * Constructor for a CompletionProcessor. Call getCompletionProcessor()
 * to obtain instances.
 * @param editorManager 
 * @param containingEditor 
 * @param preferenceStore
 */
public CompletionProcessor(ContainedEditorManager editorManager, 
        ContainingEditor containingEditor, IPreferenceStore preferenceStore){
    this.editorManager = editorManager;
    this.containingEditor = containingEditor;
    this.preferenceStore = preferenceStore;
}