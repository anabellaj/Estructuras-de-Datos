/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lista;

/**
 *
 * @author Anabella Jaua
 */
public interface ListaI {
    public void insertBegin(int element);
    public void insertFinal (int element);
    public void insertInIndex (int element, int index);
    public Nodo deleteFinal();
    public Nodo deleteBegin();
    public Nodo deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
