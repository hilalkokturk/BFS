
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag {
    private Node first;    // beginning of bag
    private int N;               // number of elements in bag

    // helper linked list class
    private static class Node<Item> {
        private int item;
        private Node<Item> next;
        
    }

   
    public Bag() {
        first = null;
        N = 0;
    }

    public int size() {
        return N;
    }

    
    public void add(int w) {
        Node oldfirst = first;
        first = new Node();
        first.item = w;
        first.next = oldfirst;
        N++;
    }
    
    }
    