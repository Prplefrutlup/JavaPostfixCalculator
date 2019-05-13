package com.prple.postfixcalc;

import java.util.EmptyStackException;

public final class LinkedStack<Integer> implements StackInterface {

    private Node topNode;

    //default constructor
    public LinkedStack() {
        topNode = null;
    }

    //method to add integer to stack
    @Override
    public void push(int newEntry) {
        topNode = new Node(newEntry, topNode);
    }

    //method to remove and return top integer of stack
    @Override
    public int pop() {
        int top = peek();

        assert topNode != null;

        topNode = topNode.getNextNode();
        return top;
    }

    //method to retrieve top item of stack w/o altering the stack
    @Override
    public int peek() {

        if(isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            return topNode.getData();
        }
    }

    //method to check if the stack is empty
    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    //method to clear the stack
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
