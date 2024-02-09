/**
 * Called when the UI has been to be updated to be in the
 * {@link State#PULL_TO_REFRESH} state.
 */
protected void onPullToRefresh(){
    switch (mCurrentMode) {
        case PULL_FROM_END:
            mFooterLayout.pullToRefresh();
            break;
        case PULL_FROM_START:
            mHeaderLayout.pullToRefresh();
            break;
        default:
            // NO-OP
            break;
    }
}