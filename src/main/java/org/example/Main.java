package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);



        try {
            int a = 10;
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir entre cero");
        } catch (NumberFormatException nfe){
            System.out.println("No escribiste el dato de manera correcta");
        } finally {
            System.out.println("Siempre se va a ejecutar");
        }
        System.out.println("Fin del programa ");
    }
}