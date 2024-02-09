/**
 * Whether check the package name. if true,then the package name of the local app should be the same as
 * new app.if not set,true default.
 * @param checkPackageName
 * @return
 */
public Builder checkPackageName(boolean checkPackageName){
    this.checkPackageName = checkPackageName;
    return this;
}