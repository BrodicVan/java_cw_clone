/**
 * <p>
 * Enable command timeout callback
 * </p>
 * <p>
 * This will invoke the onCommandResult() callback with exitCode
 * WATCHDOG_EXIT if a command takes longer than watchdogTimeout seconds
 * to complete.
 * </p>
 * <p>
 * If a watchdog timeout occurs, it generally means that the Interactive
 * session is out of sync with the shell process. The caller should
 * close the current session and open a new one.
 * </p>
 *
 * @param watchdogTimeout Timeout, in seconds; 0 to disable
 * @return This Builder object for method chaining
 */
@NonNull
public Builder setWatchdogTimeout(int watchdogTimeout){
    this.watchdogTimeout = watchdogTimeout;
    return this;
}