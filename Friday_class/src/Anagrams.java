import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérek egy szót: ");
        String input = scan.nextLine();
        System.out.println("Kérek egy anagrammát a megadott szóra: ");
        String anagram = scan.nextLine();
        scan.close();

        input = input.replaceAll("\\s","");
        anagram = anagram.replaceAll("\\s", "");
        char[] inputArray = input.toCharArray();
        char[] anagramArray = anagram.toCharArray();


        if ( inputArray.length != anagramArray.length ){
            System.out.println("A szöveg és az anagramma értelmes betűszáma nem egyezik");
            System.exit(1);
        }

        char lockedChar = 0;
        int charactersMatch = 0;


        for(int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < anagramArray.length; j++) {
                if (inputArray[i] == anagramArray[j] && inputArray[i] != lockedChar) {
                    charactersMatch++;
                    lockedChar = inputArray[i];
                }
            }
        }

        if (charactersMatch == inputArray.length) {
            System.out.println("A beírt anagramma helyes");
        } else {
            System.out.println("A beírt anagramma helytelen");
        }

    }

}
