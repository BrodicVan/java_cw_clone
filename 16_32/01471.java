/**
 * Construct a Sequencer with the selected strategies.
 *
 * @param claimStrategy for those claiming sequences.
 * @param waitStrategy for those waiting on sequences.
 */
public Sequencer(final ClaimStrategy claimStrategy, final WaitStrategy waitStrategy){
    this.claimStrategy = claimStrategy;
    this.waitStrategy = waitStrategy;
}