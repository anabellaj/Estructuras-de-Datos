/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa.pkg1;



/**
 *
 * @author Anabella Jaua
 */
public class MainRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Inputs ventana = new Inputs();
        Lista list1 = new Lista();
        Lista list2 = new Lista();
//        ventana.setVisible(true);
        
        System.out.println("hola");
//        Lista list = new Lista();
//        for (int i = 10; i > 0; i--) {
//            list.insertBegin(i);
//        }
//        list.printList();
//    }
        
        
        
        list1.insertBegin(1);
        list1.insertBegin(2);
        list1.insertBegin(3);
        list1.printList();
        list2.insertBegin(1);
        list2.insertBegin(2);
        list2.insertBegin(3);
        list2.insertBegin(1);
        list2.insertBegin(1);
        list2.insertBegin(1);
        list2.insertBegin(1);
        list2.insertBegin(1);
        list2.insertBegin(2);
        list2.insertBegin(3);
        list2.insertBegin(1);
        list2.insertBegin(2);
        list2.insertBegin(3);
        System.out.println(" ");
        list2.printList();
        Solucion f = new Solucion();
        int respuesta = f.Solucion(list1, list2);
        System.out.println("");
        System.out.println("Cantidad de sublistas en la Lista 2: "+respuesta);

//        for (int i = 0; i < 10; i++) {
//            list1.insertBegin(i);
//        }
//        list1.printList();
//        list1.deleteBegin();
//        System.out.println("");
//        list1.printList();
//        list1.insertFinal(15);
//        System.out.println("");
//        list1.printList();
//        list1.deleteFinal();
//        System.out.println("");
//        list1.printList();
//        list1.insertIndex(60, 3);
//        System.out.println("");
//        list1.printList();
//        list1.deleteIndex( 3);
//        System.out.println("");
//        list1.printList();
    }
    
}
