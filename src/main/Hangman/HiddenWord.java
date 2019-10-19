
public class HiddenWord {
    private String word;
    private boolean discoveredLetters[];


    public HiddenWord(String word) {
        this.word = word;
        discoveredLetters = new boolean[word.length()];
    }

    public boolean CheckCharC(char c) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            currentChar = Character.toLowerCase(currentChar);
            c = Character.toLowerCase(c);

            if (currentChar == c) {
                discoveredLetters[i] = true;
                found = true;
            }
        }
        return found;
    }


    public String getDiscoveredWord() {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (discoveredLetters[i]) {
                result += word.charAt(i);
            } else {
                result += '_';
            }
        }
        return result;
    }
}

