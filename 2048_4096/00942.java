/**
 * Since Shedlock internally uses CAS (Compare And Set) operations
 * This configuration helps to have a granular control on the CAS consistency.
 * @return Builder
 */
public Builder withSerialConsistencyLevel(@NonNull ConsistencyLevel serialConsistencyLevel){
    this.serialConsistencyLevel = serialConsistencyLevel;
    return this;
}