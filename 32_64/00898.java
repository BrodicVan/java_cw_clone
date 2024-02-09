/**
 * Creates a {@code LinkedBlockingDeque} with the given (fixed) capacity.
 * 
 * @param capacity
 *            the capacity of this deque
 * @throws IllegalArgumentException
 *             if {@code capacity} is less than 1
 */
public LinkedBlockingDeque(int capacity){
	if (capacity <= 0)
		throw new IllegalArgumentException();
	this.capacity = capacity;
}