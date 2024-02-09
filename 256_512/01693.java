/**
 *  根据手机的分辨率从px(像素) 的单位 转成为dp
 */
public static int px2dip(Context context, float pxValue){
    final float scale = context.getResources().getDisplayMetrics().density;
    return (int) (pxValue / scale + 0.5f);
}