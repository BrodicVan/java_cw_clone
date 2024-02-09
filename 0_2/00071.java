/**
 * Start the precondition activity using a given intent, which should
 * have been created by calling createPreconditionIntent.
 * @param activity
 * @param intent
 */
public static void startPreconditionActivityAndFinish(Activity activity,
        Intent intent){
    activity.startActivity(intent);
    activity.finish();
}