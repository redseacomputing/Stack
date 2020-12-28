import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeEach
    void initializeStackClass() {
        stack = new Stack(32);
    }

    @Test
    void test_Stack_Size() {
        assertEquals(32, stack.internalStack.length);
    }

    @Test
    void stack_should_push_element_on_first_position() {
        stack.push("Position 0");
        stack.push("Position 1");
        assertEquals("Position 1", stack.pop());
    }

    @Test
    void stack_should_push_32_elements_and_work() {
        fillStackCompletely();
    }

    private void fillStackCompletely() {
        for (int i = 0; i < 32; i++) {
            stack.push("Dummy");
        }
    }

    @Test
    void stack_should_throw_an_exception_if_it_is_full_and_push() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fillStackCompletely();
            stack.push("IndexOutOfBound");
        });
    }

    @Test
    void stack_should_throw_an_exception_if_it_is_empty_and_pop() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.pop();
        });
    }
}

