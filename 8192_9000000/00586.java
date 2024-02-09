/**
 * @param suppressErrorUi
 *            true indicates to the receiver that no error UI (e.g. dialog) should now displayed.
 */
public ThrowableFailureEvent(Throwable throwable, boolean suppressErrorUi){
    this.throwable = throwable;
    this.suppressErrorUi = suppressErrorUi;
}