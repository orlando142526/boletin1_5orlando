/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5orlando;

import java.util.Scanner;

/**
 *
 * @author oyagualendara
 */
public class Boletin1_5orlando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantas millas queres pasar a metros?");
        float millas = sc.nextFloat();
System.out.println("Son "+millas*1852+" metros"); 

        
    }
    
}
