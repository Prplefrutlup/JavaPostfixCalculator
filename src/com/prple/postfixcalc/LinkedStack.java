package com.prple.postfixcalc;

import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface {

    private Node topNode;

    //default constructor
    public LinkedStack() {
        topNode = null;
    }


    @Override
    public void push(Object newEntry) {
        topNode = new Node(newEntry, topNode);
    }

    @Override
    public Object pop() {
        Object top = peek();

        assert topNode != null;

        topNode = topNode.getNextNode();
        return top;
    }

    @Override
    public Object peek() {

        if(isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            return topNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;

    }


    private class Node {

        private Object data; // Entry in stack
        private Node next; // Link to next node

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNextNode() {
            return next;
        }

        public void setNextNode(Node next) {
            this.next = next;
        }
    }
}
