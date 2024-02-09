/**
 * DocumentBuilderFactory instance (lazy initialization)
 * 
 * @return
 */
private static DocumentBuilderFactory getDocumentBuilderFactory(){
	if(documentBuilderFactory == null){
		documentBuilderFactory = DocumentBuilderFactory.newInstance();
	}
	return documentBuilderFactory;
}