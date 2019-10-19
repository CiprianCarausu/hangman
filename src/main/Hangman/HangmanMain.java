import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        Scanner scannedWord = new Scanner(System.in);


        HiddenWord word = new HiddenWord("bondoc");
        HangmanLives hangmanLives = new HangmanLives(5);

        while (true) {
            if(hangmanLives.isOver())
                break;
            System.out.println("Enter letter");
            char c = scannedWord.nextLine().charAt(0);
            boolean checkeChar = word.CheckCharC(c);

            if (checkeChar == true) {
                hangmanLives.correctChar();
            } else {
                hangmanLives.wrongChar();
            }

            System.out.println("Entered letter :" + c + " Is it true or false? " + word.CheckCharC(c) + "." + " Current lives: " + hangmanLives.getLivesCount());
            System.out.println(word.getDiscoveredWord());
        }




       /* System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : y. Is it true or false? " + word.CheckCharC('y') + "."  + " Current lives: " + hangmanLives.wrongChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : x. Is it true or false? " + word.CheckCharC('x') + "."  + " Current lives: " + hangmanLives.wrongChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : b. Is it true or false? " + word.CheckCharC('b') + "." + " Current lives: " + hangmanLives.correctChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : n. Is it true or false? " + word.CheckCharC('n') + "." + " Current lives: " + hangmanLives.correctChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : d. Is it true or false? " + word.CheckCharC('d') + "." + " Current lives: " + hangmanLives.correctChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : x. Is it true or false? " + word.CheckCharC('x') + "."  + " Current lives: " + hangmanLives.wrongChar());
        System.out.println(word.getDiscoveredWord());
        System.out.println("Entered letter : w. Is it true or false? " + word.CheckCharC('w') + ". "  + hangmanLives.isOver());
        System.out.println("You almost managed!!.. sort of. " + " (" + word.getDiscoveredWord() + ")");
*/

    }
}



