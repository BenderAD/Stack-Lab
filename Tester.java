/**
 * Tester class for ArrayStack and ListStack
 * Shows method implementation as well as exception/problem handling
 * @author Alex Bender
 *
 */
public class Tester {
	public static void main(String[] args){
		//Block 1 shows off the method functionality of ArrayStack
		System.out.println("---- PART 1: ArrayStack ----");
		System.out.println();
		
		ArrayStack test1 = new ArrayStack();
		System.out.println("Expected starting size for test1: 0");
		System.out.println("Actual starting size for test1:   " + test1.size());
		try{
		test1.push("Alex");
		test1.push("Alan");
		System.out.println("Pushed 'Alex' and 'Alan' to the stack");
		System.out.println("Expected top of the stack: Alan");
		System.out.println("Actual top of the stack:   " + test1.top());
		test1.push("Jim");
		test1.push("Sharon");
		test1.push("Phyllis");
		test1.push("Karen");
		System.out.println("Pushed 'Jim', 'Sharon', 'Phyllis', and 'Karen' to the stack");
		test1.push(null);}
		catch(NullPointerException e){
			System.err.println("NullPointerException: " + e.getMessage());
		}
		System.out.println();
		System.out.println("Expected top of the stack: Karen");
		System.out.println("Actual top of the stack:   " + test1.top());
		System.out.println("Expected size of stack: 6");
		System.out.println("Actual size of stack:   " + test1.size());
		System.out.println("Expected toString of stack: [Alex, Alan, Jim, Sharon, Phyllis, Karen]");
		System.out.println("Actual toString of stack:   " + test1.toString());
		test1.pop();
		test1.pop();
		System.out.println("Popped two values from the stack");
		System.out.println("Expected top of stack: Sharon");
		System.out.println("Actual top of stack:   " + test1.top());
		System.out.println("Expected result of isEmpty: false");
		System.out.println("Actual result of isEmpty:   " + test1.isEmpty());
		System.out.println("Expected current toString of stack: [Alex, Alan, Jim, Sharon]");
		System.out.println("Actual current toString of stack:   " + test1.toString());
		System.out.println();
		
		String[] array1 = {"Albert", "James", "Gideon"};
		ArrayStack test2 = new ArrayStack(array1);
		System.out.println("Expected starting size and toString for test2: 3 and [Albert, James, Gideon]");
		System.out.println("Actual starting size and toString for test2:   "+ test2.size() + " and " + test2.toString());
		test2.push("Johannes");
		test2.push("Craig");
		test2.push("Harold");
		test2.push("Ila");
		System.out.println("Pushed 'Johannes', 'Craig', 'Harold', and 'Ila' to the stack");
				
		System.out.println("Expected current toString of stack: [Albert, James, Gideon, Johannes, Craig, Harold, Ila]");
		System.out.println("Actual current toString of stack:   " + test2.toString());
		System.out.println("Expected top of stack: Ila");
		System.out.println("Actual top of stack:   "+ test2.top());
		test2.pop();
		test2.pop();
		test2.pop();
		test2.pop();
		test2.pop();
		test2.pop();
		test2.pop();
		System.out.println("Popped 7 values from the stack");
		System.out.println("Expected top of stack: Stack is empty");
		System.out.println("Actual top of stack:   " + test2.top());
		System.out.println("Expected isEmpty result and size: true and 0");
		System.out.println("Actual isEmpty result and size:   " + test2.isEmpty() + " and " + test2.size());
		System.out.println();
		
		
		//Block 2 shows off the method functionality of ListStack
		System.out.println("---- PART 2: ListStack ----");
		System.out.println();
		
		ArrayStack test3 = new ArrayStack();
		System.out.println("Expected starting size for test3: 0");
		System.out.println("Actual starting size for test3:   " + test3.size());
		test3.push("Alex");
		System.out.println("Pushed 'Alex' to the stack");
		test3.push("Alan");
		System.out.println("Pushed 'Alan' to the stack");
		System.out.println("Expected top of the stack: Alan");
		System.out.println("Actual top of the stack:   " + test3.top());
		test3.push("Jim");
		test3.push("Sharon");
		test3.push("Phyllis");
		test3.push("Karen");
		System.out.println("Pushed 'Jim', 'Sharon', Phyllis, and 'Karen' to the stack");
		System.out.println("Expected top of the stack: Karen");
		System.out.println("Actual top of the stack:   " + test3.top());
		System.out.println("Expected size of stack: 6");
		System.out.println("Actual size of stack:   " + test3.size());
		System.out.println("Expected toString of stack: [Alex, Alan, Jim, Sharon, Phyllis, Karen]");
		System.out.println("Actual toString of stack:   " + test3.toString());
		test3.pop();
		test3.pop();
		System.out.println("Popped two values from the stack");
		System.out.println("Expected result of isEmpty: false");
		System.out.println("Actual result of isEmpty:   " + test3.isEmpty());
		System.out.println("Expected current toString of stack: [Alex, Alan, Jim, Sharon]");
		System.out.println("Actual current toString of stack:   " + test3.toString());
		System.out.println();
		
		String[] array2 = {"Albert", "James", "Gideon"};
		ArrayStack test4 = new ArrayStack(array2);
		System.out.println("Expected starting size and toString for test4: 3 and [Albert, James, Gideon]");
		System.out.println("Actual starting size and toString for test4:   "+ test4.size() + " and " + test4.toString());
		try{
		test4.push("Johannes");
		System.out.println("Pushed 'Johannes' to the stack");
		test4.push("Craig");
		System.out.println("Pushed 'Craig' to the stack");
		test4.push("Harold");
		System.out.println("Expected top of stack: Harold");
		System.out.println("Actual top of stack:   " + test4.top());
		test4.push("Ila");
		System.out.println("Pushed 'Harold' and 'Ila' to the stack");
		
		test4.push(null);}
		catch(NullPointerException exc){
			System.err.println("NullPointerException: " + exc.getMessage());
		}
		System.out.println();
		System.out.println("Expected current toString of stack: [Albert, James, Gideon, Johannes, Craig, Harold, Ila]");
		System.out.println("Actual current toString of stack:   " + test4.toString());
		System.out.println("Expected top of stack: Ila");
		System.out.println("Actual top of stack:   "+ test4.top());
		test4.pop();
		test4.pop();
		test4.pop();
		test4.pop();
		test4.pop();
		test4.pop();
		test4.pop();
		System.out.println("Popped 7 values from the stack");
		System.out.println("Expected isEmpty result and size: true and 0");
		System.out.println("Actual isEmpty result and size:   " + test4.isEmpty() + " and " + test4.size());
		}
		
}
