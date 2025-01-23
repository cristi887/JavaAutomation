package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test
    public void metodaTest(){
       // metodaVerificareNumar(7);
      //  metodaVerificareNumar(5);
      //  metodaVerificareParPozitiv(0);
        zileSaptamana(3);
    }

    // verificam un numar mai mare decat 5
    public void metodaVerificareNumar(int valoare){
        if (valoare>5){
            System.out.println("numarul "+ valoare +" este mai mare decat 5");
        }
        else if (valoare<5){
            System.out.println("numarul "+ valoare +" este mai mic decat 5");
        }
        else {
            System.out.println("numarul "+valoare+" este egal cu 5");
        }

    }

    // verificam daca un numar e par pozitiv sau negativ
    public void metodaVerificareParPozitiv(int valoare){
        if (valoare > 0){
            if (valoare % 2 == 0){
                System.out.println("numarul "+valoare+" este par pozitiv");
            }
            else {
                System.out.println("numarul "+valoare+" este impar pozitiv");
            }
        }
        else if (valoare < 0){
            if (valoare % 2 == 0){
                System.out.println("numarul "+valoare+" este par negativ");
            }
            else {
                System.out.println("numarul "+valoare+" este impar negativ");
            }
        } else if (valoare == 0) {
            System.out.println("numarul este zero");
        }
    }

    //exemplu cu swithc case
    public void zileSaptamana(Integer zi){

        switch (zi){
            case 1:
                System.out.println("Azi e luni");
                break;
            case 2:
                System.out.println("Azi e marti");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break;
            case 4:
                System.out.println("Azi e joi");
                break;
            case 5:
                System.out.println("Azi e vineri");
                break;
            case 6:
                System.out.println("Azi e sambata");
                break;
            case 7:
                System.out.println("Azi e duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");
        }

    }
}
