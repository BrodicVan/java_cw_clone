/**
 * 根据手机的分辨率从从dp转成为px(像素)
 * @param context 全局context
 * @param dpValue dp值
 * @return px像素值
 */
public static int dip2px(Context context, float dpValue){
    final float scale = context.getResources().getDisplayMetrics().density;
    return (int) (dpValue * scale + 0.5f);
}