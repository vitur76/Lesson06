package MyNumber;

public class MyNumber {
        public static void Start() {
            int count = 0;

            for (int i = 100; i <= 1000; i++) {
                if (i % 5 == 0 && i % 6 == 0) {
                    System.out.print(i + " ");
                    count++;

                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
            }
        }
}
