/**
 * NOTE: This must be here so that if you get TypedSession from the NoSqlEntitManager, he will
 * have the same session object and flush flushes both typed and ORM data at the same time!!!
 * To be removed eventually
 * @param s
 */
public void setInformation(NoSqlSession s, MetaLoader mgr){
	this.session = s;
	this.mgr = mgr;
}