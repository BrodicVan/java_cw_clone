/**
 * 获取一个LinearLayout
 *
 * @param context 上下文
 * @param orientation 流向
 * @param width 宽
 * @param height 高
 * @param weight 权重
 * @return LinearLayout
 */
public static LinearLayout createLinearLayout(Context context, int orientation, int width, int height, int weight){
    LinearLayout linearLayout = new LinearLayout(context);
    linearLayout.setOrientation(orientation);
    linearLayout.setLayoutParams(
            new LinearLayout.LayoutParams(width, height, weight));
    return linearLayout;
}