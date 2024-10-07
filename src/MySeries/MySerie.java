package MySeries;

public class MySerie {
        public static void Start() {
            double suma = 0.0;

            for (int i = 1; i <= 97; i += 2) {
                suma += (double) i / (i + 2);
            }

            System.out.println("Suma seriei este: " + suma);
        }
}

