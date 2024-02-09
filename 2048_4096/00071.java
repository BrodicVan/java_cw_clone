/**
 * @param gravity Gravity of the drawable. E.g. Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,
 * means that drawable coordinates are applied to the center of the bottom edge of the
 * drawable.
 */
public Marker setGravity(int gravity){
    this.gravity = gravity;
    return this;
}