/**
 * Like {@link #getFramingRect} but coordinates are in terms of the preview frame,
 * not UI / screen.
 */
public Rect getFramingRectInPreview(){
    if (framingRectInPreview == null) {
        Rect rect = new Rect(getFramingRect());
        Point cameraResolution = configManager.getCameraResolution();
        Point screenResolution = configManager.getScreenResolution();
        //modify here
//      rect.left = rect.left * cameraResolution.x / screenResolution.x;
//      rect.right = rect.right * cameraResolution.x / screenResolution.x;
//      rect.top = rect.top * cameraResolution.y / screenResolution.y;
//      rect.bottom = rect.bottom * cameraResolution.y / screenResolution.y;
        rect.left = rect.left * cameraResolution.y / screenResolution.x;
        rect.right = rect.right * cameraResolution.y / screenResolution.x;
        rect.top = rect.top * cameraResolution.x / screenResolution.y;
        rect.bottom = rect.bottom * cameraResolution.x / screenResolution.y;
        framingRectInPreview = rect;
    }
    return framingRectInPreview;
}