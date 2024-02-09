/**
 * 设置View的外边距(Margins)
 *
 * @param view 要设置外边距的View
 * @param left 左侧外边距
 * @param top 顶部外边距
 * @param right 右侧外边距
 * @param bottom 底部外边距
 */
public static void setMargins(View view, int left, int top, int right, int bottom){
    if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view
                .getLayoutParams();
        p.setMargins(left, top, right, bottom);
        view.requestLayout();       //请求重绘
    }
}