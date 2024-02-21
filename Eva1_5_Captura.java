/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class Eva1_5_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        System.out.println("introduce tu nombre: ");
        //crear nuestro scanner
        Scanner captura = new Scanner(System.in);
        //captura
        nombre = captura.nextLine();
        System.out.println("introduce tu edad:");
        edad = captura.nextInt();
        System.out.println("Tu eda es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
         System.out.println(edad);
    }
    
}
