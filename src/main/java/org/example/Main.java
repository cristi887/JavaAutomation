package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // citireNote();
        // printareValoriWhile();
        // printareValoriDoWhile();
        printareFor();


    }

    public static void citireNote(){

        System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    }

    public static void printareValoriWhile(){
        int valoare=6;
        while (valoare <= 5){
            System.out.println("Valoarea este: "+valoare);
            valoare++;
        }
        System.out.println("Valoare dupa while este: "+valoare);
    }

    public static void printareValoriDoWhile(){

        int valoare=6;
        do {
            System.out.println("Valoare este: "+valoare);
            valoare++;
        } while (valoare <= 5);
        System.out.println("Valoare dupa DO-while este  : "+valoare);
    }

    public static void printareFor(){

        for (int valoare=1; valoare <= 5; valoare++){
            System.out.println("Valaorea este: "+valoare);
        }

    }
}