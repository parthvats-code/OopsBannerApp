package uc7;
public class OOPSBannerAppUC7 {

    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap patternObj : patterns) {
            if (patternObj.getCharacter() == ch) {
                return patternObj.getPattern();
            }
        }
        return new String[7];
    }

    public static void displayBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] pattern = getCharacterPattern(word.charAt(i), patterns);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        displayBanner("OOPS", patterns);
    }
}
