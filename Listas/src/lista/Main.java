/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

/**
 *
 * @author Anabella Jaua
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo = new Nodo (5);
        Lista list = new Lista();
        for (int i = 0; i<10; i++) {
            list.insertFinal(i);
        }
        list.insertInIndex(11);
        list.deleteFinal();
        list.deleteFinal();
        list.deleteBegin();
        list.deleteInIndex(2);
        list.deleteInIndex(6);
        list.printList();
    }   
}
