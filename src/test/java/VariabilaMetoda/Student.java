package VariabilaMetoda;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

public class Student {

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;

    @Test
    public void prezentareStudent (){
        Nume ="Baciu";
        Prenume = "Dorel";
        Varsta = 21;
        Adresa ="Dorobanti";
        Inaltime = 1.70;
        Greutate = 75.5f;
        Sex = 'M';
        AreDiploma = true;

        //System.out.println(Nume+' '+Prenume+' '+Varsta+' '+Adresa);

        System.out.println("Numele studentului este: "+ Nume);
        System.out.println("Prenumele studentului este: "+ Prenume);
        System.out.println("Varsta studentului este: "+ Varsta);
        System.out.println("Adresa studentului este: "+ Adresa);
        System.out.println("Inaltimea studentului este: "+ Inaltime);
        System.out.println("Greutatea studentului este: "+ Greutate);
        System.out.println("Sexul studentului este: "+ Sex);
        System.out.println("Are studentul diploma? "+ AreDiploma);

        calculMedie();
        getSalariu();
    }

    public void calculMedie(){
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1+nota2+nota3)/3;

        System.out.println("Media stundetului este: "+medie);
    }

    //metoda cu return
    public Integer getSalariu(){

        Integer salariu = 80000;
        return salariu;
    }
}