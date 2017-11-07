import java.util.Scanner;

public class Lower_and_upper_case {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kérek egy szöveget: ");
        String text = scan.nextLine();


        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

    }
}
