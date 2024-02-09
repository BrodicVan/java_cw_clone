/**
 * Construct an Action State pair, intended meaning: this Action takes you
 * to State
 * 
 * @param a
 *            the action to carry out
 * @param s
 *            the state travelled to
 */
public ActionStatePair(Action a, State s){
	action = a;
	state = s;
}