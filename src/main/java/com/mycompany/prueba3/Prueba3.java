/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba3 {

    public static void main(String[] args) {
        //Poniento valores distintos por pantalla; Aa, 5, PI
        
        Scanner sc = new Scanner(System.in);
        double num = 0;
        System.out.println("Introduce un número");
        try {
            num = sc.nextInt();
            System.out.println("Tu número es " + num + ". ");
        } catch (InputMismatchException e) {
            System.out.println("El número introducido no es válido. ");
        } finally {
            System.out.println("¡Chao, pescao!");
        }

    }
}
