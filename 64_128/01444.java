/**
 * @param indexField
 *            the indexfile
 * @param queryString
 *            the queryString
 * @return list a list of url
 */
public Searcher(String docDirectory, String indexField){
	this.docDirectory = docDirectory;
	this.indexField = indexField;
}