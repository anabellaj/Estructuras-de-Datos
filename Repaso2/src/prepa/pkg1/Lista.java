/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa.pkg1;

/**
 *
 * @author Anabella Jaua
 */
public class Lista {
    private Nodo head;
    private int length;

    public Lista() {
        this.head = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    private boolean isEmpty(){
        return getHead() == null;
    }

    public int getLength() {
        return length;
    }

    
    
    public void insertBegin(int element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            length++;
        } else{
            node.setNext(getHead());
            setHead(node);
            length++;
        }
    }
    
    public void deleteBegin (){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
        } else{
            Nodo head = getHead();
            Nodo newHead = head.getNext();
            setHead(newHead);
            head.setNext(null);
            
        }
    }
    
    public void insertFinal(int element){
        Nodo node = new Nodo(element);
        Nodo pointer = getHead();
        while (pointer.getNext()!= null){
            pointer = pointer.getNext();
        }
        pointer.setNext(node);
    }
    
    public void deleteFinal(){
        Nodo pointer = getHead();
        while (pointer.getNext().getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.setNext(null);
    }
    
    public void insertIndex(int element, int index){
        Nodo nodo = new Nodo(element);
        if (index ==0){
            insertBegin(element);
        } if (index>getLength()){
            System.out.println("Index out of range");
        } else{
            Nodo pointer = getHead();
            int cont =0;
            while (cont != index-1){
                pointer = pointer.getNext();
                cont++;
            }
            nodo.setNext(pointer.getNext());
            pointer.setNext(nodo);
            
        }
    }
    
    public void deleteIndex(int index){
        if (index == 0){
            deleteBegin();
        } if (index>getLength()){
            System.out.println("Index out of range");
        } else{
            int cont =0;
            Nodo pointer = getHead();
            while (cont != index-1){
                pointer = pointer.getNext();
                cont++;
            }
            Nodo pointer2 = pointer.getNext();
            pointer.setNext(pointer2.getNext());
            pointer2.setNext(null);
        }
    }
    
    public void printList(){
        Nodo pointer = getHead();
        while (pointer != null){
            System.out.print("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
    }
    
    

}
