
public class HangmanLives {
    private int livesCount;

    public HangmanLives(int livesCount) {
        this.livesCount  = livesCount;
    }

    public int correctChar() {
        return livesCount;
    }

    public int wrongChar() {
        livesCount--;
        return livesCount;
    }

    public String isOver() {
        if (livesCount < 1) ;
        String isOver = "Is over.";
        return isOver;
    }
}
