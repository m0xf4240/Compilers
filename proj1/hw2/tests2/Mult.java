public class Mult {

    public static void main(String[] args) {

	int size;
	size = 15;

	int[][] table;
	table = makeTable(size);
	printTable(table);

    }

    static int[][] makeTable (int size) {

	int[][] t;
	t = new int[size][];

	int i;
	i=0;

	while (i < size) {
	    t[i] = new int[size];
	    int j;
	    j = 0;
	    while (j < size) {
		t[i][j] = i*j;
		j = j+1;
	    }
	    i = i+1;
	}

	return t;
    }

    static void printTable (int[][] t) {

	int i;
	i = 0;

	while (i < t.length) {

	    int j;
	    j = 0;
	    while (j < t.length) {
		String s;

		s = t[i][j] + "";

		int leng;
		leng= s.length();

		while (leng < 5) {
		    System.out.print (" ");
		    leng = leng+1;
		}
		System.out.print(s);
		j = j+1;
	    }
	    System.out.print("\n");
	    i = i+1;
	}
    }
}
