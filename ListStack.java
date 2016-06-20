/** Part 2 of Lab3Stack: Linked List Implementation of a Stack
 * @author Alex Bender
 */
public class ListStack implements Stack{ //denotes the interface class Stack which allows for a more general usage of ListStack
	 private int size;
	 private ListStackNode top;
	 
	 /**
	 * Constructor for empty stack 
	 */
	public ListStack(){
		 size = 0;
		 top = null;
	 }
	 
	 /**
	 * Constructor for stack with inserted names
	 * @param names the initial list of names added to stack
	 */
	public ListStack(Object[] names){
		 for (int i = 0; i < names.length; i++){
			 ListStackNode val = new ListStackNode(names[i]);
			 val.setNext(top);
			 top = val;
		 }
	 }
	 
	/** 
	 * Pushes an Object onto the stack
	 * @param name, the Object to be added (pushed) to the stack
	 * @return true if Object is successfully added.
	 */
	public boolean push (Object name) throws NullPointerException{
		 ListStackNode value = new ListStackNode(name);
		 if (name == null){
			 throw new NullPointerException("Can't push a null value to the stack.");
		 }
		 if (top == null){
			 top = value;
			 return true;
		 }
		 else{
			 value.setNext(top);
			 top = value;
			 return true;
		 }
	 }
	
	/** Pops an object off the stack and returns it
	 * @return the Object to be removed (popped) off the stack
	 */ 
	public Object pop(){
		 if (isEmpty()){
			 return "Stack is empty";
		 }
		 ListStackNode previous = top;
		 top = previous.getNext();
		 size -= 1;
		 return previous.getValue();
	 }
	
	/** Returns the top of the stack or an "empty" message
	 * @return the Object at the top of the stack
	 */ 
	 public Object top(){
		 if(isEmpty()){
			  return "Stack is empty";
		 }
		 return top.getValue();
	 }
	 /** Returns size of the stack
	  * @return current number of elements in the stack
	  */
	 public int size(){
		 return size;
	 }
	 /**
	  * Returns String representation of the stack
	  * @return String version of the stack, with the top being the first element in the list
	  */
	 public String toString(){
		 if(isEmpty()){return "Empty stack";}
		ListStackNode printOut = top;
		String printed = "[";
		while(printOut != null){
			printed += printOut.getValue();
			if(printOut.getNext() != null){
				printed +=  ", ";
				}
				printOut = printOut.getNext();
			}
			printed += "]";
			return printed;
	 }
	 /** Returns true if stack is empty
	  * @return true if empty stack
	  */
	 public boolean isEmpty(){
		 return top == null;
	 }
}
