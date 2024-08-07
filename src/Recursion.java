public class Recursion {
    public static void main(String[] args) {
       System.out.println(factorial(8));
       System.out.println(fibonacci(10));
    }

    static int factorial(int n){
        if (n==0 || n ==1){
            return 1;
        
        }
        else{
            return n * factorial(n-1);
        }

    }

    // fibbonacci series

    static int fibonacci(int n){
        int i,t=0,t2=1,nextterm;
        for (i=0;i<n;i++){
            nextterm = t+t2;
            t = t2;
            t2 = nextterm;
            System.out.println(t2);
        }
        return t2; 
    }
}
