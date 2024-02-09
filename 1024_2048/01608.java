/**
 * Checks for EGL errors.
 */
private void checkEglError(String msg){
    int error;
    if ((error = EGL14.eglGetError()) != EGL14.EGL_SUCCESS) {
        throw new RuntimeException(msg + ": EGL error: 0x" + Integer.toHexString(error));
    }
}