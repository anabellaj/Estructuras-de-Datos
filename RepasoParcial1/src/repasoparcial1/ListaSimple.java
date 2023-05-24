/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoparcial1;

/**
 *
 * @author Anabella Jaua
 */
public class ListaSimple {
    private Nodo head;
    private int length;

    public ListaSimple() {
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
    
    public void printList(){
        Nodo pointer = getHead();
        while (pointer.getNext() != null){
            System.out.println("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
    }
    
    
}
