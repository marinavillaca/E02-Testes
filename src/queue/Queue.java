package queue;

import java.util.LinkedList;

public class Queue<Trem> {
    private LinkedList<Trem> lista;

    public Queue() {
        this.lista = new LinkedList<>();
    }

    public boolean estaVazia() {
        return lista.isEmpty();
    }

    public int tamanho() {
        return lista.size();
    }

    public void enfileirar(Trem elemento) {
        lista.addLast(elemento);
    }

    public Trem desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        return lista.removeFirst();
    }
}