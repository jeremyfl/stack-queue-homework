/**
 * Stack
 */
public class Stack {

    private long[] stackArray;
    private int top;

    Stack(int size) {
        stackArray = new long[size];
        top = -1;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public long pop() {
        // first in first out
        return stackArray[top--];
    }

    public long top() {
        return stackArray[top];
    }

    public Boolean isEmpty() {
        return (top == -1);
    }

}