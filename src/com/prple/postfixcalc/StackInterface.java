package com.prple.postfixcalc;

public interface StackInterface<Integer> {

    /** Adds new entry to top of the stack.
     * @param newEntry integer to be added to top of stack
     */
    void push(int newEntry);

    /** Removes an entry from the top of the stack and returns that entry
     * @return integer at top of stack
     * @throws java.util.EmptyStackException if stack is empty
     */
    int pop();

    /** @return top entry of stack
     * @throws java.util.EmptyStackException
     */
    int peek();

    /** Checks if stack is empty
     * @return true is stack is empty
     */
    boolean isEmpty();

    /** clears/removes all entries from the stack
     */
    void clear();

}

