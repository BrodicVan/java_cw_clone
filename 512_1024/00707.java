/**
 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
 *
 * @param context
 * @param dpValue 要转换的dp值
 */
public static int dip2px(Context context, float dpValue){
    final float scale = context.getResources().getDisplayMetrics().density;
    return (int) (dpValue * scale + 0.5f);
}