/**
 * 将sp值转换为px值，保证文字大小不变
 *
 * @return
 */
public static int sp2px(Context context, float spValue){
    final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
    return (int) (spValue * fontScale + 0.5f);
}