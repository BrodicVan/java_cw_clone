/**
 * This allows you to add extra LoadingLayout instances to this proxy. This
 * is only necessary if you keep your own instances, and want to have them
 * included in any
 * {@link PullToRefreshBase#createLoadingLayoutProxy(boolean, boolean)
 * createLoadingLayoutProxy(...)} calls.
 * 
 * @param layout - LoadingLayout to have included.
 */
public void addLayout(LoadingLayout layout){
	if (null != layout) {
		mLoadingLayouts.add(layout);
	}
}