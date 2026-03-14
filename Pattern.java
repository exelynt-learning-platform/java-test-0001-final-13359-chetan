public class Main {

    // Method to print one row of the hollow diamond
    public static void printRow(int n, int i, boolean upper) {

        // spaces
        if (upper) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
        } else {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
        }

        // first star
        System.out.print("*");

        // hollow spaces and second star
        if (i > 1) {
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 5;

        // upper part
        for (int i = 1; i <= n; i++) {
            printRow(n, i, true);
        }

        // lower part
        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i, false);
        }
    }
}
