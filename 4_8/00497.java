/**
 * Find config attrib.
 *
 * @param egl the egl
 * @param display the display
 * @param config the config
 * @param attribute the attribute
 * @param defaultValue the default value
 * @return the int
 */
private int findConfigAttrib(EGL10 egl, EGLDisplay display,
        EGLConfig config, int attribute, int defaultValue){

    if (egl.eglGetConfigAttrib(display, config, attribute, mValue)) {
        return mValue[0];
    }
    return defaultValue;
}