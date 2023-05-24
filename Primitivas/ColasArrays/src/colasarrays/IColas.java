/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package colasarrays;

/**
 *
 * @author Anabella Jaua
 */
public interface IColas {
    public void enqueue(Object element);
    public void dequeue();
    public Nodo dispatch();
    public boolean isEmpty();
    public void printQueue();
    public int SearchSpace();
}
