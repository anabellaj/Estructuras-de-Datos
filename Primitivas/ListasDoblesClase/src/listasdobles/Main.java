/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobles;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble list = new ListaDoble();
        for (int i = 0; i < 10; i++) {
            list.insertFinal(i);
        }
        list.printList();
        list.deleteInIndex(5);
        list.printList();
    }
    
}
