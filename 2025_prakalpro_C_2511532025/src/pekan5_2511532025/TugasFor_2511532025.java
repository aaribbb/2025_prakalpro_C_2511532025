package pekan5_2511532025;

public class TugasFor_2511532025 {

	public static void main(String[] args) {

        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
            System.out.print("=");
        }
        System.out.print("#");
        System.out.println();

        for (int line = 1; line <= 4; line++) {
            System.out.print("|"); 
            for (int j = 1; j <= (4 - line); j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            for (int k = 2; k <= line; k++) {
                System.out.print("....");
            }
            System.out.print("<>");
            for (int l = 1; l <= (4 - line); l++) {
                System.out.print("  ");
            }
            System.out.print("|");
            System.out.println();
        }

        for (int line = 4; line >= 1; line--) {
            System.out.print("|");
            for (int j = 1; j <= (4 - line); j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            for (int k = 2; k <= line; k++) {
                System.out.print("....");
            }
            System.out.print("<>");
            for (int l = 1; l <= (4 - line); l++) {
                System.out.print("  ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
            System.out.print("=");
        }
        System.out.print("#");
        System.out.println();
    }
}
