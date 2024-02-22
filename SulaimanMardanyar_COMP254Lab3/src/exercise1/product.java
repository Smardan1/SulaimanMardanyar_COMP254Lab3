package exercise1;

public class product {

	private static int prod(int n, int m) {
		if(n == 0) {
			return 0;
		} else {
			return m + prod(n -1, m);
			// n = 3, m = 4
			//this will look something like -> 4+(4+(4))
			//this is because once n = 0, the function will return 0 and then pass control back to the first function call in order
			//i believe it would actually look like -> 4+(4+(4+(0))) but we can remove the 0
		}
	}
	public static void main(String[] args) {
		System.out.println("Testing product method\n___________________");
		//testing with small numbers
		long start = System.nanoTime();
		int total = prod(3, 4);
		long end = System.nanoTime();
		long elapsed = end - start;
		System.out.printf("recursive product method took %d nano seconds, answer is %d%n", elapsed, total);

		//testing with bigger numbers
		start = System.nanoTime();
		int total1 = prod(4325, 15254);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("\nrecursive product method took %d nano seconds, answer is %d%n", elapsed, total1);

	}
}
