/**
 * 获取当前Activity（堆栈中最后一个压入的）
 */
public Activity currentActivity(){
    Activity activity = activityStack.lastElement();
    return activity;
}