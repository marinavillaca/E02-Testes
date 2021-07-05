package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> fila;

    public Queue(){
        this.fila=new LinkedList<Trem>();
    }

    public int tamanho(){
        return fila.size();
    }

    public boolean estaVazia() {
        return this.fila.isEmpty();
    }

   public void enfileirar( Trem elemento){
        this.fila.add(elemento);
   }

   public Trem desenfileirar() throws EmptyStackException{
       if(this.fila.isEmpty()) {
           throw  new EmptyStackException();
       }

       Trem item = fila.remove(fila.size()- fila.size());

        return item;
   }
}