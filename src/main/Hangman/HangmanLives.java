
public class HangmanLives {
    private int livesCount;

    public int getLivesCount() {
        return livesCount;
    }

    public HangmanLives(int livesCount) {
        this.livesCount = livesCount;
    }

    public int correctChar() {
        return livesCount;
    }

    public int wrongChar() {
        livesCount--;
        return livesCount;
    }

    public boolean isOver() {
        if (livesCount < 1) {
            System.out.println("Is over.");
            return true;
        }
        return false;
    }
}
