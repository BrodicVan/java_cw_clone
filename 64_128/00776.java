/**
 * 释放录音资源，在activity/fragment onStop()方法中调用
 */
public void releaseRecord(){
	if(mRecorder != null){
		mRecorder.release();
		mRecorder = null;
	}
}