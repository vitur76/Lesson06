package MyScanner;

import java.util.Scanner;

public class MyInput {
    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        int numar, suma = 0, pozitive = 0, negative = 0;

        System.out.println("Introduceți numere întregi (0 pentru a opri):");

        while (true) {
            numar = scanner.nextInt();

            if (numar == 0) {
                break;
            }

            if (numar > 0) {
                pozitive++;
            } else if (numar < 0) {
                negative++;
            }

            suma += numar;
        }

        // Afișarea rezultatelor
        System.out.println("Numere pozitive: " + pozitive);
        System.out.println("Numere negative: " + negative);
        System.out.println("Suma totală: " + suma);
    }
}

