package com.prple.postfixcalc;

public interface StackInterface<T> {

    /** Adds new entry to top of the stack.
     * @param newEntry object to be added to top of stack
     */
    void push(T newEntry);

    /** Removes an entry from the top of the stack and returns that entry
     * @return Object at top of stack
     * @throws java.util.EmptyStackException if stack is empty
     */
    T pop();

    /** @return top entry of stack
     * @throws java.util.EmptyStackException
     */
    T peek();

    /** Checks if stack is empty
     * @return true is stack is empty
     */
    boolean isEmpty();

    /** clears/removes all entries from the stack
     */
    void clear();

}

