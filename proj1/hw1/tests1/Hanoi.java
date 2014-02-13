public class Hanoi {

    static int count;

    public static void main (String[] args) {

	count = 0;

	hanoi (9, 1, 2);

	System.out.print ("\nTotal moves: " + count + "\n");
    }

    static void hanoi (int n, int from, int to) {

	count = count + 1;

	if (n == 1) 
	    System.out.print ("Move disk 1 from " + from + " to " + to + "\n");
	else {
	    int other;
	    other = 6 - from - to;

	    hanoi(n-1, from, other);
	    System.out.print ("Move disk " + n + " from " + from + " to " + 
			      to + "\n");
	    hanoi(n-1, other, to);
	}
    }
}