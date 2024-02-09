/**
 * if new app is available, and the forceupdate is true,then the user must upgrade,
 * otherwise the app is not available.
 *
 * @return Builder
 */
public Builder forceUpdate(boolean forceUpdate){
    this.forceUpdate = forceUpdate;
    return this;
}