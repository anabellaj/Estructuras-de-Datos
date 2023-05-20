/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Anabella Jaua
 */
public interface ListaI {
    public void insertBegin(String element);
    public void insertFinal (String element);
    public void insertInIndex (String element, int index);
    public Nodo deleteFinal();
    public Nodo deleteBegin();
    public Nodo deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
