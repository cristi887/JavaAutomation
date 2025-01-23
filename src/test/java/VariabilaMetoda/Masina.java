package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;

    public String model;

    public Integer anFabricatie;

    @Test
    public void metodaTest(){

        // dateMasina("BMW","Seria 3",2020);
        //dateMasina("Audi","RS7",2020);

        // calculMedie(9.81,7.55);

        // citireNote();
    }

    public void dateMasina(String param1,String param2, Integer param3){

        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul fabricatiei este: "+anFabricatie);

    }

    // calculam media a 2 numere
    public void calculMedie(Double nota1,Double nota2){
        Double rezultat= (nota1+nota2)/2;
        System.out.println("Media este: "+rezultat);
    }

   /* public void citireNote(){

        System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    } */

}
