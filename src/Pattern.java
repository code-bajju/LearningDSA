public class Pattern {

    // Simple pattern Printing

    public static void patternprint(int n) {
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
    }

    public static void main(String[] args) {
        patternprint(2);
    }
}