import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack {
	private Node first; // top of stack
	private int N; // size of the stack

	// helper linked list class
	private static class Node {
		private String item;
		private Node next;
	}

	public Stack() {
		first = null;
		N = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return N;
	}

	public void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public String pop() {
		if (isEmpty())
			throw new NoSuchElementException("Stack underflow");
		String item = first.item; // save item to return
		first = first.next; // delete first node
		N--;
		return item; // return the saved item
	}

	public String peek() {
		if (isEmpty())
			throw new NoSuchElementException("Stack underflow");
		return first.item;
	}

}