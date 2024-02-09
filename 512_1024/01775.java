/**
 * 设置Item点击监听
 * @param onWeekItemClickedListener
 * @return
 */
public WeekView callback(IWeekView.OnWeekItemClickedListener onWeekItemClickedListener){
    this.onWeekItemClickedListener = onWeekItemClickedListener;
    return this;
}