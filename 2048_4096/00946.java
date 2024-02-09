/**
 * Sets the isolation level for ShedLock. See {@link java.sql.Connection} for constant definitions.
 * for constant definitions
 */
public Builder withIsolationLevel(int isolationLevel){
    this.isolationLevel = isolationLevel;
    return this;
}