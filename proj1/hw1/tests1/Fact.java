public class Fact {

    public static void main (String[] args) {
	System.out.print (fact(10) + "\n");
    }

    static int fact(int n) {
	if (n <= 1)
	    return n;
	else
	    return n*fact(n-1);
    }
}
