public class Stack {

    Object[] internalStack;
    int pointer;
    int size;

    Stack(int size) {
        this.size = size;
        internalStack = new Object[this.size];
        pointer = 0;
    }

    public void push(Object element) {
        if (pointer > 32) {
            throw new IndexOutOfBoundsException();
        } else {
            internalStack[pointer] = element;
            incrementPointer();
        }
    }

    public Object pop() {
        if (pointer < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            decrementPointer();
            return internalStack[pointer];
        }
    }

    private void decrementPointer() {
        pointer--;
    }

    private void incrementPointer() {
        pointer++;
    }


}
