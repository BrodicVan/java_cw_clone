/**
 * if new app is available, and the autoUpdate is true,then the client
 * will check update and upgrade automatically.
 *
 * @return Builder
 */
public Builder autoUpdate(boolean autoUpdate){
    this.autoUpdate = autoUpdate;
    return this;
}