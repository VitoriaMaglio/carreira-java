package br.com.alura.screenmatch.modelos;

import java.util.Scanner;

public class Var {



    public static void main(String[] args) {

         int x = 12;
         double y = 4.4;

        //Casting conversão de tipos de variáveis -> cria uma nova var para armazenar a conversão e coloca entre parênteses o tipo q vc quer

        double xDouble = (double) x ;
        int yInt = (int) y;
        System.out.println(x);
        System.out.println(xDouble);
        System.out.println(y);
        System.out.println(yInt);

        //Conversão de temperatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma temperatura em Celsius: ");
        int cel = scanner.nextInt();
        double far = ((double) cel * 9 / 5) + 32;
        System.out.println(far);
    }


}
