public class Main {

    // Constant value 
    private static final int DIAMOND_SIZE = 5;

    // Method to print upper part row
    public static void printUpperRow(int n, int i) {
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (i > 1) {
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }

    // Method to print lower part row
    public static void printLowerRow(int n, int i) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (i > 1) {
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = DIAMOND_SIZE;

        // Upper part
        for (int i = 1; i <= n; i++) {
            printUpperRow(n, i);
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            printLowerRow(n, i);
        }
    }
}
