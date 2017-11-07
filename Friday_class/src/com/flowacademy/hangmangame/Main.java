package com.flowacademy.hangmangame;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] solutionsArray = {"alma", "banán", "sapka", "kés", "metódus",
                "lézer", "könyv", "láma", "dráma", "majom",
                "szamár", "tető", "vonal", "kutya", "macska",
                "süt", "nap", "bot", "király", "sirály",
                "fakó", "árpa", "kerítés", "ágyú", "lovas",
                "zene", "laptop", "bárd", "dal", "utca"
        };

        int chosenSolutionId = random.nextInt(15);
        String solution = solutionsArray[chosenSolutionId];
        char[] solutionChar = solution.toCharArray();
        int tries = solutionChar.length;
        boolean[] solved = new boolean[solutionChar.length];

        for (int i = 0; i < tries; i++) {
            for ( int j = 0; j < solutionChar.length; j++) {
                if ( solved[j] == true ) {
                    System.out.print(solutionChar[j]);
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
            System.out.println("Kérek egy tippet: ");
            String guess = scanner.nextLine();
            if (guess.toCharArray().length == solutionChar.length){
                if(guess.equals(solution)){
                    System.out.println("Nyert!");
                    System.exit(0);
                }
                char[] guessArray = guess.toCharArray();
                for (int k = 0; k < guessArray.length; k++) {
                    for (int j = 0; j < solutionChar.length; j++) {
                        if (guessArray[k] == solutionChar[j]){
                            solved[j] = true;
                        }
                    }
                }
            } else {
                System.out.println("A tipp karakterszáma nem lehet nagyobb a keresett betű szószámánál");
                tries++;
            }

        }

        System.out.println("Nem nyert!");
        scanner.close();
    }
}
