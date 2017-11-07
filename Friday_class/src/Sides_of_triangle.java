import java.util.Scanner;

public class Sides_of_triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérem a háromszög oldalait: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        if ( a + b > c && a + c > b && b + c > a ) {
            System.out.println("Lehetséges háromszög");
        } else {
            System.out.println("A megadott oldalak hibásak");
            System.exit(1);
        }
    }
}
