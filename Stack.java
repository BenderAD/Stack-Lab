/**
 * Interface class allowing for more general usage of ArrayStack and ListStack classes
 * The classes here mirror those in ArrayStack and ListStack.
 * @author ABender
 *
 */
public interface Stack {
	/**
	 * Adds Object value to the top of the stack.
	 */
	boolean push(Object value);
	
	/**
	 * Removes the top value from the stack and returns it.
	 */
	Object pop();
	
	/**
	 * Returns the top value of the stack
	 */
	Object top();
	
	/**
	 * Returns the number of elements in the stack currently. 
	 */
	int size();
	
	/**
	 * Returns true if the stack is empty.
	 */
	boolean isEmpty();
	
	/**
	 * Returns a String representation of the stack.
	 */
	String toString();
	
	
}
