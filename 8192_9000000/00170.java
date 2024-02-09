/**
 * Creates a new OptimizedJsonReaderImplInitializer.
 *
 * @param programClassPool    the program class pool used for looking up
 *                            program class references.
 * @param libraryClassPool    the library class pool used for looking up
 *                            library class references.
 * @param codeAttributeEditor the code attribute editor used for editing
 *                            the code attribute of the static initializer.
 * @param deserializationInfo contains information on which classes and
 *                            fields to deserialize and how.
 */
public OptimizedJsonReaderImplInitializer(ClassPool           programClassPool,
                                          ClassPool           libraryClassPool,
                                          CodeAttributeEditor codeAttributeEditor,
                                          OptimizedJsonInfo   deserializationInfo){
    this.programClassPool    = programClassPool;
    this.libraryClassPool    = libraryClassPool;
    this.codeAttributeEditor = codeAttributeEditor;
    this.deserializationInfo = deserializationInfo;
}