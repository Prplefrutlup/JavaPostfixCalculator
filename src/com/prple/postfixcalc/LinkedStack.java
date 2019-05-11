package com.prple.postfixcalc;

import java.util.EmptyStackException;

public final class LinkedStack<Integer> implements StackInterface {

    private Node topNode;

    //default constructor
    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(int newEntry) {
        topNode = new Node(newEntry, topNode);
    }

    @Override
    public int pop() {
        int top = peek();

        assert topNode != null;

        topNode = topNode.getNextNode();
        return top;
    }

    @Override
    public int peek() {

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

        private int data; // Entry in stack
        private Node next; // Link to next node

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
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
