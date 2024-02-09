/*
 * Tries once to acquire the right to use an EGL surface. Does not block.
 *
 * @return true if the right to use an EGL surface was acquired.
 */
public synchronized boolean tryAcquireEglSurface(GLThread thread){
	if (mEglOwner == thread || mEglOwner == null) {
		mEglOwner = thread;
		notifyAll();
		return true;
	}
	return false;
}