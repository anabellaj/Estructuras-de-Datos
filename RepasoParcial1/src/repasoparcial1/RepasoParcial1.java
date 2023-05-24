/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoparcial1;

/**
 *
 * @author Anabella Jaua
 */
public class RepasoParcial1 {

    public static void main(String[] args) {
        ListaSimple list = new ListaSimple();
        for (int i = 0; i < 10; i++) {
            list.insertBegin(i);
        }
        list.printList();
        System.out.println("Hola");
    }
    
}
