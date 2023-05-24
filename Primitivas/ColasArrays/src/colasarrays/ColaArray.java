/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasarrays;

/**
 *
 * @author Anabella Jaua
 */
public class ColaArray implements IColas {
    private Nodo[] queue;
    private int head, tail;
    private int maxSize;
    private int size;

    public ColaArray(int maxSize) {
        queue = new Nodo[1];
        this.head = 0;
        this.tail = 0;
        this.maxSize = maxSize;
        this.size = 1;
    }

    public Nodo[] getQueue() {
        return queue;
    }

    public void setQueue(Nodo[] queue) {
        this.queue = queue;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int SearchSpace(){
        for (int i = 0; i < getSize(); i++) {
            if(getQueue()[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void enqueue(Object element) {
        Nodo node = new Nodo(element);
        if (isEmpty()){
            getQueue()[getHead()] = node;
            setTail(getHead());
        } else{
            if (getSize() >= getMaxSize()){
                System.out.println("No hay espacio disponible");
            } else{
                int position = SearchSpace();
                if (position ==-1){
                    Nodo[] newQueue = new Nodo[getSize()+1];
                    for (int i = 0; i < getSize(); i++) {
                        newQueue[i] = getQueue()[i];
                    } 
                    newQueue[getSize()] = node;
                    getQueue()[getTail()].setNext(getSize());
                    setTail(getSize());
                    setSize(getSize()+1);
                    setQueue(newQueue);
            } else{
                    getQueue()[position] = node;
                    getQueue()[getTail()].setNext(position);
                    setTail(position);
                }
            }   
        } size++;
    }

    @Override
    public void dequeue() {
        if (isEmpty()){
            System.out.println("The queue is empty.");
        }
        else{
            Nodo pointer = getQueue()[getHead()];
            getQueue()[getHead()] = null;
            setHead(pointer.getNext());
            size--;
        }
    }

    @Override
    public Nodo dispatch() {
        if (isEmpty()){
            System.out.println("The queue is empty.");
        }
        else{
            Nodo pointer = getQueue()[getHead()];
            getQueue()[getHead()] = null;
            setHead(pointer.getNext());
            size--;
            return (Nodo)pointer.getElement();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return getQueue()[getHead()] == null;
    }
    

    @Override
    public void printQueue() {
        if (isEmpty()){
            System.out.println("The queue is empty");
        } else{
            for (int i = 0; i < getSize(); i++) {
                if (getQueue()[i]!= null){
                    System.out.println("["+getQueue()[i]+"]");
                } else{
                    System.out.println("["+getQueue()[i]+"]");
                }
            }
        }
    }
        
    
    
    
    
    
}
