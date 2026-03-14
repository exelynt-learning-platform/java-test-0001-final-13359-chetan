public class Main {
    public static void main(String[] args) {

        int n = 5;
      
        //loop for upper part
        for (int i = 1; i <= n; i++) {

            // loop for spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            //print first star
            System.out.print("*");

            // loop for hollow space
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }

                // print second star
                System.out.print("*");
            }

            System.out.println();
        }

        // loop for Lower part
        for (int i = n - 1; i >= 1; i--) {

            //loop for spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // print first star
            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }

                // print second star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
