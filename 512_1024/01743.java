/**
 * 将px值转换为sp值，保证文字大小不变
 *
 * @return
 */
public static int px2sp(Context context, float pxValue){
    final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
    return (int) (pxValue / fontScale + 0.5f);
}