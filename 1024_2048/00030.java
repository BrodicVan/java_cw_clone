/**
 * Listener used to get {@link AppRate} lifecycle
 *
 * @param onShowListener the listener
 * @return the {@link AppRate} instance
 */
public AppRate listener(OnShowListener onShowListener){
    this.onShowListener = onShowListener;
    return this;
}