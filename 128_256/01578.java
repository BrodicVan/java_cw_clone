/**
 * px转dp
 */
public static float px2dp(Context context, float pxVal){
    final float scale = context.getResources().getDisplayMetrics().density;
    return (pxVal / scale);
}