/**
 * Basic node class that holds a String and a Pointer to the next node
 * @author Josh Sauder (sjoshua270); Method names and class structure belong to Josh.
 * 
 * @author adapted for Part 2 by Alex Bender (azb3667) from Lab2BasicList.
 * 
 */
public class ListStackNode{

	ListStackNode next;
	Object data;
	
	/**
	 * Constructor method
	 * @param Initial String
	 */
	public ListStackNode(Object newValue){
		next = null;
		data = newValue;
	}
	
	/**
	 * Returns the value of the Node
	 * @return String stored in the node
	 */
	public Object getValue(){
		return data;
	}
	
	/**
	 * Sets the value of the Node
	 * @param New String newValue to be set
	 */
	public void setValue(String newValue){
		data = newValue;
	}
	
	/**
	 * Returns the next Node in the list
	 * @return Next Node in the linked list
	 */
	public ListStackNode getNext(){
		return next;
	}
	
	/**
	 * Sets the next Node in the list
	 * @param New next Node in the linked list
	 */
	public void setNext(ListStackNode newNext){
		next = newNext;
	}
}
