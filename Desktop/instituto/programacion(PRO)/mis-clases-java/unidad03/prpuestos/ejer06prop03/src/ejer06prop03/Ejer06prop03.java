/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer06prop03;

/**
 * 
 * @author Carlos Pascual
 * @version 12.1
 */
public class Ejer06prop03 {
/**
 * Método con el cual se realizan las tablas de multiplicar del al 10
 * @param args i, numero entero que nos marca el numero del que se realiza la tabla
 * @param args j, numero entero que nos marca porque numero se multiplica i
 */
    
    public static void main(String[] args) {
        
        
     for (int i = 1; i <= 10; i++) {
             System.out.println(" ");
            System.out.println("TABLA DEL " + i);
             /**
              * 
              */
            for (int j = 1; j <= 10; j++) {
                System.out.println(i  + " X " + j + " = " + i*j);
            }
            
        }
    }
    
}
