/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Anabella Jaua
 */
public class Prepa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Castear variables
        String numero ="190";
        int numero1 = Integer.parseInt(numero);
        System.out.println(numero1);
        
//      Para los float hay que colocar float x =19.5f o float x = float(19.5)

//      Seleccionar caracteres por indice:
        String j = "Hola";
        char h = j.charAt(0);
        System.out.println(h);
//      Si queremos declarar un caracter, se debe realizar con comillas simples

//      Ejemplo de pop-up (parecido a scanner)
        String cadena = JOptionPane.showInputDialog("Frase");
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
