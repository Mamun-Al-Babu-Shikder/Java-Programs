public class StackImplementation {

	public static void main(String[] args)
	{
		
		MyStack<Integer> myStack = new MyStack<>(5);
		
		System.out.println("Stack is empty : "+myStack.isEmpty());
		
		myStack.push(101);
		myStack.push(123);
		myStack.push(205);
		myStack.push(503);
		
		System.out.println("Stack is full : "+myStack.isFull());
		System.out.println("Current size : "+myStack.size());
		System.out.println("Capacity : "+myStack.capacity());
		System.out.println("Peek value : "+myStack.peek());
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
		myStack.clear();
		
	}
	
}

class MyStack<E>
{
	private Object[] stack;
	private int max_size;
	private int size;
	
	public MyStack(int max_size) {
		this.max_size = Math.abs(max_size);
		stack = new Object[this.max_size];
		this.size = -1;
	}
	
	public boolean isEmpty() {
		if(size<0)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(size+1==max_size)
			return true;
		return false;
	}
	
	public void push(E element) {
		size++;
		if(size==max_size) {
		  System.out.println("Stack overflow");
		  size--;
		}else {
			stack[size] = element;
		}
	}
	
	@SuppressWarnings("unchecked")
	public E peek() {
		if(size<0) {
			System.out.println("Stack Underflow"); 
			return null;
		}else {
			return (E) stack[size];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		
		if(size<0) {
			System.out.println("Stack Underflow"); 
			return null;
		}else {
		  return (E) stack[size--];
		}
	}
	
	public void clear() {
		size = -1;
	}
	
	public int size() {
		return size+1;
	}
	
	public int capacity() {
		return this.max_size;
	}
}