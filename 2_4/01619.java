/**
 * Add a Action to the exitActions-List.
 * This Actions are called, when exit this state 
 * 
 * @param exitAction		the Action
 * @return self
 */
public State<CONTEXT, STATENAME> addExitAction(Action<CONTEXT> exitAction){
	exitActions.add(exitAction);
	return this;
}