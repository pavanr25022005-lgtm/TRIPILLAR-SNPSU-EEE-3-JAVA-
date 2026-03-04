package conditionalstatements;

public class starmirror {

        public static void main(String[] args) {
            int n = 6;

            for (int i = 1; i <= 2 * n - 1; i++) {
                int stars = i <= n ? i : 2 * n - i;

                for (int j = 1; j <= stars; j++)
                    System.out.print("*");

                for (int j = 1; j <= 2 * (n - stars); j++)
                    System.out.print(" ");

                for (int j = 1; j <= stars; j++)
                    System.out.print("*");

                System.out.println();
            }
        }
    }

