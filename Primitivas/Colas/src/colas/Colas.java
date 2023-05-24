/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author Anabella Jaua
 */
public class Colas implements IColas{
    private Nodo head;
    private Nodo tail;
    private int size;

    public Colas() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void enqueue(Object element) {
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            setTail(node);
        } else{
            Nodo pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        } size++;
    }

    @Override
    public void dequeue() {
        if (isEmpty()){
            System.out.println("La cola esta vacia");
        } else{
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            } size--;
        } 
    }

    @Override
    public Nodo dispatch() {
        if (isEmpty()){
            System.out.println("La cola esta vacia");
        } else{
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            } size--;
            return pointer;
        } return null;
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }

    @Override
    public void printQueue() {
        Nodo pointer = getHead();
        while (pointer!=null){
            System.out.println("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
    }
    
    
    
    
}
