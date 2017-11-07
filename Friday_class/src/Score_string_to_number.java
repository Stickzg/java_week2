import java.util.Scanner;

public class Score_string_to_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérek egy érdemjegyet: ");
        String score = scan.next();
        scan.close();

        int scoreInInt = 0;

        switch (score) {
            case "ötös":
                scoreInInt = 5;
                System.out.println(scoreInInt);
                break;
            case "négyes":
                scoreInInt = 4;
                System.out.println(scoreInInt);
                break;
            case "hármas":
                scoreInInt = 3;
                System.out.println(scoreInInt);
                break;
            case "kettes":
                scoreInInt = 2;
                System.out.println(scoreInInt);
                break;
            case "egyes":
                scoreInInt = 1;
                System.out.println(scoreInInt);
                break;
            default:
                System.out.println("A megadott érték nem helyes");
                System.exit(1);
                break;
        }
    }
}
