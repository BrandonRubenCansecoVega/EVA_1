/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EV2_23_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 5;//NUMERO QUE TIENE QUE ADIVINAR (ENTRE 1-10)
        int valor = 0;//VALOR PARA ALMACENAR LO QUE CAPTURE EL USUARIO 
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("¿Cual es el numero? (Entre 1 y 10)");
            valor = captu.nextInt();
        }while(nume != valor);
        System.out.println("GG");
    }
    
}
