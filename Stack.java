/**
 * A simple Stack implementation using an array
 * Stack follows LIFO (Last In First Out) principle
 */
public class Stack {
    private int[] items;
    private int top;
    private int capacity;

    /**
     * Constructor to initialize stack with a given capacity
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.top = -1;
    }

    /**
     * Check if stack is empty
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Check if stack is full
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Push an element onto the stack
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        items[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    /**
     * Pop an element from the stack
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return items[top--];
    }

    /**
     * Peek at the top element without removing it
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return items[top];
    }

    /**
     * Get the size of the stack
     */
    public int size() {
        return top + 1;
    }

    /**
     * Print all elements in the stack
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    /**
     * Main method to demonstrate stack operations
     */
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display stack
        stack.display();

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Get size
        System.out.println("Stack size: " + stack.size());

        // Pop elements
        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        // Display stack after pop
        stack.display();

        // Try to push more elements
        stack.push(50);
        stack.push(60);
        stack.push(70); // This will cause overflow
    }
}
