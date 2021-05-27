package com.briup.day.day16.Test.MyLinkedList;

public class MyLinkedList<E> {

    private int size;
    private Node first;
    private Node last;

    private class Node {
        private Object data;
        private Node pre;
        private Node next;
    }

    public void add(E e) {
        Node node = new Node();
        node.data = e;
        if (first == null) {
            first = node;
        } else {
            node.pre = last;
            last.next = node;
        }
        last = node;
        size++;
    }

    public void add(int index, E data) {
        Node newNode = new Node();
        newNode.data = data;
        if (index == size) {
            add(data);
         } else {
            Node node = get(index);
            Node preNode = node.pre;
            preNode.next = newNode;
            if (preNode == null) {
                first = newNode;
            } else {
                preNode.next = newNode;
            }
            newNode.next = node;
            size++;
        }
    }

    public void remove(int index) {
        Node node = get(index);
        Node nextNode = node.next;
        Node preNode = node.pre;
        if (preNode == null) {
            first = nextNode;
        } else {
            preNode.next = nextNode;
            node.pre = null;
        }if (nextNode == null) {
            last = preNode;
        } else {
            nextNode.pre = preNode;
            node.next = null;
        }
        size--;
    }

    public Node get(int index) {
        Node node = null;
        if (first != null) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        return node;
    }

    public int getSize() {
        return this.size;
    }

    public void show() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(get(i).data);
        }
    }

}
