package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count = 0;

    public void addLast(int item) {
        var node = new Node(item);
        count++;
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        count++;
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void print() {
        var temp = first;
        while (temp != null) {
            System.err.println(temp.value);
            temp = temp.next;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int count = 0;
        var temp = first;
        while (temp != null) {
            if (temp.value == item) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        count--;
        if (first == last) {
            first = last = null;
            return;
        }
        var temp = first.next;
        first.next = null;
        first = temp;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        count--;
        if (first == last) {
            first = last = null;
            return;
        }
        var temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        last = temp;
        last.next = null;
    }

    public int size() {
        return count;
    }

    public int[] toArray() {
        var array = new int[count];
        var temp = first;
        int index = 0;
        while (temp != null) {
            array[index] = temp.value;
            index++;
            temp = temp.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        var current = first.next;
        var previous = first;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

}
