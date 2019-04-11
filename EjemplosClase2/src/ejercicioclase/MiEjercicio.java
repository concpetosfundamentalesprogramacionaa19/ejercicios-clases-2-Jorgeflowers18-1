/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Jorgeso
 */
public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        int nota1;
        int nota2;
        double prom;
        String ciudad;
        String pais;
        Scanner tec = new Scanner(System.in);

        System.out.println("Por favor ingrese sus nombre:");
        nombre = tec.nextLine();

        System.out.println("Por favor ingrese sus apellido:");
        apellido = tec.nextLine();

        System.out.println("Por favor ingrese su edad:");
        edad = tec.nextInt();
        
        tec.nextLine();
        
        System.out.println("Por favor ingrese su ciudad:");
        ciudad = tec.nextLine();
        
        System.out.println("Por favor ingrese su país de origen:");
        pais = tec.nextLine();
        
        System.out.println("Por favor ingrese sus dos notas a promediar:");
        nota1 = tec.nextInt();
        nota2 = tec.nextInt();
        
        prom = (nota1 + nota2) / 2;
        
        System.out.printf("Sus nombres y apellidos: %s %s \nEdad: %s\nCiudad: "
                + "%s\nPais: %s\nNotas: %s, %s\nPromedio: %s", nombre, 
                apellido, edad, ciudad, pais, nota1 ,nota2, prom);
    
                
    }

}
