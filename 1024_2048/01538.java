/**
 * 将px值转换为sp值，保证文字大小不变
 *
 * @param pxValue
 * @param context （DisplayMetrics类中属性scaledDensity）
 * @return
 */
public static int px2sp(Context context, float pxValue){
    final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
    return (int) (pxValue / fontScale + 0.5f);
}