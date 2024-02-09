/**
 * Along with image there are dimmed layer, crop bounds and crop guidelines that must be drawn.
 */
@Override
protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    drawDimmedLayer(canvas);
    drawCropGrid(canvas);
}