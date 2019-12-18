package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrrayInt = {10, 20, 30, 40, 50, 70, 90};

        afisareElemArray(arrrayInt);

        sumaNrArray(arrrayInt);

        int numar = 1501;

        inversareNumar(numar);
        afisareCaractereNrSiVocale();
    }

    private static void afisareCaractereNrSiVocale() {
        // afisare caracterele ale unui string;
        // afisare nr de vocale din string
        String propozitie = "Ana are mere";
        char[] arrayCaractere = propozitie.toCharArray();

        int nrVocale = 0;

        for (char element : arrayCaractere) {
            System.out.println(element);

            if (element == 'a' || element == 'A' || element == 'e'
                    || element == 'i' || element == 'o' || element == 'u') {
                nrVocale++;
            }
        }

        System.out.println("Nr vocale din string e: " + nrVocale);
    }

    /**
     * Metoda ce afiseaza un numar inversat
     *
     * @param numar o varriabila de tip intreg
     */
    private static void inversareNumar(int numar) {
        int numarInversat = 0;

        while (numar > 0) {
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }

        System.out.println("Numarul inversat este: " + numarInversat);
    }

    private static void afisareElemArray(int[] arrrayInt) {
        //afisare elem array
        for (int elem : arrrayInt) {
            System.out.println(elem);
        }
    }

    private static void sumaNrArray(int[] arrrayInt) {
        //calcul suma in functie de niste conditii:
        //a) daca elem din array == 30, nu se va calcula suma
        //b) daca suma depateste valoarea 100 se intrerupe executia arrayului

        int suma = 0;

        for (int elem : arrrayInt) {
            if (elem == 30) {
                continue;
            }

            if (suma > 100) {
                break;
            }

            suma = suma + elem;
            System.out.println("element: " + elem + " suma: " + suma);
        }

        System.out.println("Am iesit din bucla for. Suma finala este: " + suma);
    }
}
