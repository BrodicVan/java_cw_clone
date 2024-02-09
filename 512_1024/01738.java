/**
 * 针对根布局是 CoordinatorLayout, 使状态栏半透明
 * <p>
 * 适用于图片作为背景的界面,此时需要图片填充到状态栏
 *
 * @param activity       需要设置的activity
 * @param statusBarAlpha 状态栏透明度
 */
public static void setTranslucentForCoordinatorLayout(Activity activity, int statusBarAlpha){
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
        return;
    }
    transparentStatusBar(activity);
    addTranslucentView(activity, statusBarAlpha);
}