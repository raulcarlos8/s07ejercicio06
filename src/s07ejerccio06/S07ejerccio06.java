/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejerccio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejerccio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" cual es tu edad ");
        int numero1 = Integer.parseInt(reader.nextLine());
        if (numero1 < 18 ){
            System.out.println("eres menor de edad");
        }
        else {
            System.out.println("eres mayor de edad");
        }
    }
    
}
