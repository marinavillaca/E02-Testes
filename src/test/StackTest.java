package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init(){
        this.stack = new Stack<>();

    }

    @Test
    public void testEstaVazia(){
        assertTrue(stack.estaVazia());
    }

    @Test
    public void testNaoEstaVazia(){
        stack.empilhar(5);
        assertFalse(stack.estaVazia());
    }


    @Test
    public void testEmpilhar(){
        stack.empilhar(2);
        stack.empilhar(5);
        stack.empilhar(7);
        assertEquals(3, stack.tamanho());
    }

    @Test()
    public void testDesempilhar() throws Exception {
        stack.empilhar(2);
        stack.empilhar(5);
        stack.empilhar(7);
        int resultado = stack.desempilhar();
        assertEquals(7,resultado);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testDesempilharException(){
        stack.empilhar(2);
        int resultado = stack.desempilhar();
        resultado = stack.desempilhar();

    }

}