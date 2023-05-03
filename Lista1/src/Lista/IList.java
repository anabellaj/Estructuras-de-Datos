/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lista;

/**
 *
 * @author alexandralecuna
 */
public interface IList {
    
    public boolean isEmpty();
    public void insertBegin(int element);
    public void insertFinal(int element);
    public void insertIndex(int element, int i);
    public Nodo deleteBegin();
    public Nodo deleteFinal();
    public Nodo deleteIndex(int i);
    public void printList();
}
