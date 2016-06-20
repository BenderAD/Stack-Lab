import java.util.*;

/** Part 1 of Lab3Stack: Array Implementation of a Stack
 * @author Alex Bender, CS 320 Data Structures 
 * 
 */
public class ArrayStack implements Stack{
	private int top;
	private Object[] stack;
	
	/**
	 * Constructor for empty array 
	 */
	public ArrayStack(){
		stack = new Object[0];
		top = -1;
	}
	
	/**
	 * Constructor for array with inserted names
	 * @param names the initial list of names added to stack
	 */
	public ArrayStack(Object[] names){
		stack = names;
		top += names.length-1;
	}
	/** 
	 * Pushes an Object onto the stack, and adjusts size of stack if it is empty or full
	 * @param name, the Object to be added (pushed) to the stack
	 * @return true if Object is successfully added.
	 */
	public boolean push (Object name){
		if (name == null){
			throw new NullPointerException("Can't push a null value onto the stack.");}
		if (isEmpty()){ //fixes empty stack by adding 5 to size
			stack = Arrays.copyOf(stack, stack.length+5);
			
		}
		top +=1;
		if (top >= stack.length){ //fixes full stack by doubling size
			stack = Arrays.copyOf(stack, stack.length *2);} 
		
		stack[top] = name;
		return true;
	}
	/** Pops an object off the stack and returns it
	 * @return the Object to be removed (popped) off the stack
	 */
	public Object pop() throws StkException{
		if (isEmpty()){
			throw new StkException("The stack is empty.");}
		
		Object pop = stack[top];
		top -= 1;
		return pop;		
	}
	/** Returns the top of the stack or an "empty" message
	 * @return the Object at the top of the stack if not empty
	 * @return empty message otherwise
	 */
	public Object top(){
		if(!isEmpty()){
			return stack[top];}
		else{return "Stack is empty";}
	}
	
	/** Returns size of the stack
	 * @return current number of elements in the stack
	 */
	public int size(){
		return top + 1;
	}
	
	/** Returns true if stack is empty
	 * @return true if empty stack
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	/**
	 * Returns String representation of the stack
	 * @return String version of the stack, with the top being the last element in the array
	 */
	public String toString(){
		if (top == -1){
			throw new StkException("Stack is empty.");
		}
		String printed = "[";
		for (int i = 0; i < top; i++){
			printed += stack[i] + ", ";
		}
		printed += stack[top] + "]";
		return printed;
	}
	
	@SuppressWarnings("serial")
	public class StkException extends RuntimeException{
		public StkException(String message){
			super(message);
		}
	}
}
