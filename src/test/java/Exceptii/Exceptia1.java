package Exceptii;

public class Exceptia1 {
    //exceptiile reprezinta stiatii care apar in timpul executiei unui program care determina oprirea acestuia
    //ofera un mecanism eficient de indentificare si rezolvare a erorilor
    //sunt modelate sub forma de calse: clasa error, clasa exception, runtime exception, clase personalizate
    //exceptiile sunt gestionate folosind cuvinte predefinite in java: try-catch si finally
    //sunt 2 tipuri mari de exceptii: checked si uncheked
    //erorile checked: sunt exceptii de compilare (nu se poate buildui sau rula proiectul)
    //exemple de erori checked: SQLException, IOException, ClassNotFoundException
    //erorile unchecked: sunt eceptii de runtime care sunt ignorate in timpul compilarii, dar sunt aruncate in timpul executiei programului
    //exemple de erori unchecked: NullPointerException, ArrayIndexOutOfBound, AritmeticException
    //throw: este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod
    //throws: este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe exceptii

    public static void main(String[] args) throws ExceptieCustom{
       /*
        try {
            System.out.println(12/0);
        }
        catch (ArithmeticException e){
            System.out.println("Error Aritmetic exception thrown "+e.getMessage());
        }
        */

        try {
            int[] numbers = new int[10];
            numbers[11] =5;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            throw  new ExceptieCustom("Eroare custom");
            //System.out.println(e.getMessage());
        } finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa");
        }
    }
}
