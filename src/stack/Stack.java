package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<Trem> {

    private List<Trem> vetor;
    private int tamanho;

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public Stack() {
        this.vetor = new ArrayList<Trem>();
        this.tamanho = 0;
    }

    public void empilhar(Trem x) {
        vetor.add(x);
        this.tamanho++;
    }

    public Trem desempilhar() throws Exception {
        if (this.estaVazia()) {
            throw new Exception("A pilha está vazia");
        }
        this.tamanho--;
        return this.vetor.remove(this.tamanho);
    }
    
    public boolean isEmpty() {
        return estaVazia();
    }

    public int size() {
        return tamanho();
    }

    public void push(Trem item) {
        empilhar(item);
    }

    public Trem pop() throws Exception {
        return desempilhar();
    }
}