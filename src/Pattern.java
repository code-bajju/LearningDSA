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

    // Pyramid Pattern Printing

    public static void pyramidPattern(int n){
        int i , j;
        for(i = 0;i<=n;i++)
        { 
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        // patternprint(2);
        pyramidPattern(4);
    }
}