public class Fib {

    public static void main (String[] args) {

	System.out.print (fib(30) + "\n");
    }

    static int fib (int n) {
	if (n <= 1)
	    return 1;
	else 
	    return fib(n-1) + fib(n-2);
    }
}
