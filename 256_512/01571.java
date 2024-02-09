/**
 * @param schemaVersion the schema version number of the HLL. This must
 *        be greater than or equal to zero.
 * @param type the {@link HLLType type} of the HLL. This cannot
 *        be <code>null</code>.
 * @param registerCountLog2 the log-base-2 register count parameter for
 *        probabilistic HLLs. This must be greater than or equal to zero.
 * @param registerWidth the register width parameter for probabilistic
 *        HLLs. This must be greater than or equal to zero.
 * @param log2ExplicitCutoff the log-base-2 of the explicit cardinality cutoff,
 *        if it is explicitly defined. (If <code>explicitOff</code> or
 *        <code>explicitAuto</code> is <code>true</code> then this has no
 *        meaning.)
 * @param explicitOff the flag for 'explicit off'-mode, where the
 *        {@link HLLType#EXPLICIT} representation is not used. Both this and
 *        <code>explicitAuto</code> cannot be <code>true</code> at the same
 *        time.
 * @param explicitAuto the flag for 'explicit auto'-mode, where the
 *        {@link HLLType#EXPLICIT} representation's promotion cutoff is
 *        determined based on in-memory size automatically. Both this and
 *        <code>explicitOff</code> cannot be <code>true</code> at the same
 *        time.
 * @param sparseEnabled the flag for 'sparse-enabled'-mode, where the
 *        {@link HLLType#SPARSE} representation is used.
 */
public HLLMetadata(final int schemaVersion,
                   final HLLType type,
                   final int registerCountLog2,
                   final int registerWidth,
                   final int log2ExplicitCutoff,
                   final boolean explicitOff,
                   final boolean explicitAuto,
                   final boolean sparseEnabled){
    this.schemaVersion = schemaVersion;
    this.type = type;
    this.registerCountLog2 = registerCountLog2;
    this.registerWidth = registerWidth;
    this.log2ExplicitCutoff = log2ExplicitCutoff;
    this.explicitOff = explicitOff;
    this.explicitAuto = explicitAuto;
    this.sparseEnabled = sparseEnabled;
}