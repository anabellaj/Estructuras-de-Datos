/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

public class List implements IList{

    private Nodo head;
    private int lenght;

    public List() {
        this.head = null;
        this.lenght = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return getHead() == null;
    }

    public void insertBegin(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            lenght++;
        } else {
            node.setNext(head);
            setHead(node);
            lenght++;
        }
    }

    public void insertFinal(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            lenght++;
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            lenght++;
        }
    }

    public void insertIndex(int element, int i) {

        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (i == 0) {
                insertBegin(element);
            } else {
                if (i < lenght) {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < (i - 1) && pointer != null) {
                        cont++;
                        pointer = pointer.getNext();
                    }
                    node.setNext(pointer.getNext());
                    pointer.setNext(node);
                }
            }
        }
    }
    
    public Nodo deleteIndex(int i) {

        if (isEmpty()) {
            System.out.println("la lista esta vacia");;
        } else {
            if (i == 0) {
                deleteBegin();
            } else {
                if (i < lenght) {
                    Nodo pointer = getHead();
                    Nodo pointer2 = null;
                    int cont = 0;
                    while (cont < (i - 1) && pointer != null) {
                        cont++;
                        pointer = pointer.getNext();
                    }
                    pointer2 = pointer.getNext();
                    pointer.setNext(pointer2.getNext());
                    pointer2.setNext(null);
                    return pointer2;
                }
            }
        }
        return null;
    } 

    public Nodo deleteBegin() {

        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            setHead(getHead().getNext());
            pointer.setNext(null);
            lenght--;
            return pointer;
        }
        return null;
    }

    public Nodo deleteFinal() {

        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            Nodo pointer2 = null;
            if (lenght > 1) {
                while (pointer.getNext().getNext() != null) {
                    pointer = pointer.getNext();
                }
                pointer.setNext(null);
                pointer2 = pointer.getNext();
            } else {
                deleteBegin();
            }
            lenght--;
            return pointer2;
        }
        return null;
    }

    public void printList() {

        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElemento() + " ]");
            pointer = pointer.getNext();
        }
    }
}
