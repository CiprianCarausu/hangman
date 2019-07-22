
public class HangmanMain {
    public static void main(String[] args) {
        HiddenWord word = new HiddenWord("bondoc");
        HangmanLives hangmanLives = new HangmanLives(4  );

        System.out.println("Entered letter : c. Is it true or false? " + word.CheckCharC('c') + "." + " Current lives: " + hangmanLives.correctChar());
        System.out.println(word.getDiscoveredWord());
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


    }
}



