import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;
    private int n;

    private  static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }


    public Bag() {
        first = null;
        n = 0;
    }

    public void add(Item item) {

        Node<Item> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public Iterator<Item> iterator() {
        return new ListIterator<>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> cuurent;
        public  ListIterator(Node<Item> first){
            cuurent = first;
        }


        public boolean hasNext() {
            return cuurent != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = cuurent.item;
            cuurent = cuurent.next;
            return item;
        }
    }
}
