/**
 * コンストラクタ
 * @param superState 保持対象のParcelableをセット
 * @param hour 時間をセット
 * @param minute 分をセット
 */
private SavedState(Parcelable superState, int hour, int minute){
    super(superState);
    this.hour = hour;
    this.minute = minute;
}