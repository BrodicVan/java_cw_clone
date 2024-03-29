/**
 * Inserts the specified element at the end of this deque.
 *
 * @param e the element to add
 * @return <tt>true</tt> (as specified by {@link Deque#offerLast})
 * @throws NullPointerException if the specified element is null
 */
public boolean offerLast(E e){
    addLast(e);
    return true;
}