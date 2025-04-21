package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack; 
import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init() {
        stack = new Stack<>();
    }

    @Test
    public void testEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNotEmptyAfterPush() {
        stack.push(42);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSizeStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(3, stack.size());
    }

    @Test
    public void testPopReturnsCorrectElement() throws Exception {
        stack.push(5);
        stack.push(8);
        int desempilhado = stack.pop();
        assertEquals(8, desempilhado);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopOnEmptyStackReturnsNull() throws Exception {
        assertNull(stack.pop());
    }
}
