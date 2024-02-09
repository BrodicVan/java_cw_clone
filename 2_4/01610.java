/**
 * Add a Action to the entryActions-List.
 * This Actions are called, when enter this state 
 * 
 * @param entryAction		the Action
 * @return self
 */
public State<CONTEXT, STATENAME> addEntryAction(Action<CONTEXT> entryAction){
	entryActions.add(entryAction);
	return this;
}