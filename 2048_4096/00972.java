/**
 * Draw a bitmap with the result points highlighted instead of the live scanning display.
 *
 * @param result An image of the result.
 */
public void drawResultBitmap(Bitmap result){
    resultBitmap = result;
    invalidate();
}