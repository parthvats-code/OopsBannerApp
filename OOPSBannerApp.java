public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] o2 = getOPattern();  // Reuse method (DRY Principle)
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    o1[i],
                    o2[i],
                    p[i],
                    s[i]
            );
        }

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for O
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    // Helper method for P
    public static String[] getPPattern() {
        return new String[] {
                "  ****** ",
                " *     * ",
                "*       *",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    // Helper method for S
    public static String[] getSPattern() {
        return new String[] {
                "  ****** ",
                " *       ",
                "*        ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }
}
