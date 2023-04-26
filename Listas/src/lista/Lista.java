/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Anabella Jaua
 */
public class Lista {
    
    private Nodos head;
    private int length;

    public Lista(Nodos head) {
        this.head = head;
        this.length = 0;
    }

    public Nodos getHead() {
        return head;
    }

    public void setHead(Nodos head) {
        this.head = head;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
    
    public void insertBegin(int element){
        Nodos node = new Nodos (element);
        if (isEmpty()){
            setHead(head: node);
            length++;
        }else{
            node.setNext(getHead());
            setHead(Nodos);
            length++;
        }
    }
    
    public void printList(){
        Nodos pointer = getHead();
        while (pointer != null){
            System.out.println("[ "+pointer.getElement()+" ]");
            pointer = pointer.getNext();
        }
    }
    
    
}
