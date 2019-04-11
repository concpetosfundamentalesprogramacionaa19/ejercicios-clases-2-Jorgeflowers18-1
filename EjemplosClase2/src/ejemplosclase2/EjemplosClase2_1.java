/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Jorgeso
 */
public class EjemplosClase2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Por favor ingrese sus nombre:");
        nombre = tec.nextLine();
        
        System.out.println("Por favor ingrese sus apellido:");
        apellido = tec.nextLine();
        System.out.println("Su nombre es: " + nombre + "\n\n\tSu apellido es: "+
                apellido);
                
    }

}
