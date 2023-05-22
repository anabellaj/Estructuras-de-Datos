/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa.pkg1;

/**
 *
 * @author Anabella Jaua
 */
public class Solucion {
//    
//    public int existeSublista (Lista list1, Lista list2){
//        list1.printList();
//        return list1.getLength();
//        if (list1.getLength() > list2.getLength()){
//            return 0;
//        } else{
//            int cont = 0;
//            int vueltas = 0;
//            int returns = 0;
//            Nodo pivote = list1.getHead();
//            Nodo pointer = list2.getHead();
//            while (pointer.getNext() != null){
//                while (vueltas != list2.getLength()){
//                    if (pivote.getElement() == pointer.getElement()){
//                        cont++;
//                        pivote = pivote.getNext();
//                        pointer = pointer.getNext();
//                        vueltas++;
//                        if (cont == list1.getLength()){
//                            returns++;
//                            pivote = list1.getHead();
//                        }
//                    }else{
//                        vueltas++;
//                    }
//                    
//                    cont++;
//                    if (cont == list1.getLength()){
//                        returns++;
//                        cont = 0;
//                        pivote = list1.getHead();
//                    }
//                    pointer = pointer.getNext();
//                }
//                
//            } return returns;
//        } 
//}
    
    public int Solucion (Lista list1, Lista list2){
        int respuesta = 0;
        if (list1.getLength() > list2.getLength()){
            return respuesta;
        }else{
            int vueltas = 0;
            int contador = 0;
            
            Nodo pivote = list1.getHead();
            Nodo pointer = list2.getHead();
            while (pointer.getNext()!=null){
                if (pivote.getElement() != pointer.getElement()){
                    pointer =  pointer.getNext();
                    vueltas++;
                } else{
                    while (pointer.getElement() == pivote.getElement()){
                        if (pivote.getNext() == null){
                            break;
                        } else{
                            pivote = pivote.getNext();
                            
                        }
                        
                        pointer = pointer.getNext();
                        vueltas++;
                        contador++;}
                    if (contador == list1.getLength()-1){
                        respuesta++;
                        pivote = list1.getHead();
                        contador = 0;
                        
                    } else {
                        pivote = list1.getHead();
                        contador = 0;
                    }
                    } if (pointer == null){
                        vueltas = list2.getLength()-1;
//                    }if {
//                        pointer = pointer.getNext();
//                    }
                    
            }
            
        }return respuesta;
    } 
    }}
    
    