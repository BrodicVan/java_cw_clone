/**
 * @param lockedAt Locked at time.
 * @param lockUntil Locked until time.
 * @param lockedBy Locked by hostname.
 */
public LockValue(Instant lockedAt, Instant lockUntil, String lockedBy){
    this.lockedAt = lockedAt;
    this.lockUntil = lockUntil;
    this.lockedBy = lockedBy;
}