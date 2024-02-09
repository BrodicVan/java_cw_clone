/**
 * Initializes the experiment case with the parameter settings and random seeds.
 * @param parameterMap The parameter assignments.
 * @param rngSeeds The random seeds.
 */
public ExperimentCase(ParameterMap parameterMap, List<Integer> rngSeeds){
	this.parameterMap = parameterMap;
	this.rngSeeds = rngSeeds;
}