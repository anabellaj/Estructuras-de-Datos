/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasarrays;

/**
 *
 * @author Anabella Jaua
 */
public class Nodo {
    
    private Object element;
    private Integer next;

    public Nodo(Object elemento) {
        this.element = elemento;
        this.next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object elemento) {
        this.element = elemento;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer siguiente) {
        this.next = siguiente;
    }
}

