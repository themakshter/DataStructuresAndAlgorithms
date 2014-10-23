package algorithms;

public class Fibonacci {
	private static long startTime, endTime;

	public static void main(String[] args) {
		int n;
		StringBuilder sb = new StringBuilder();
		String separator = " - ";

		n = 40;
		System.out.println("For n = " + n);

		startTime();
		System.out.println("Recursive :");
		for (int i = 0; i < n; i++) {
			sb.append(fibonacciRecursive(i)).append(separator);
		}
		sb.setLength(sb.length() - separator.length());
		System.out.println(sb.toString());
		calculateTime();
		sb = new StringBuilder();
		System.out.println("Iterative Array :");
		startTime();
		for (int i = 0; i < n; i++) {
			sb.append(fibonacciIterativeArray(i)).append(separator);
		}
		sb.setLength(sb.length() - separator.length());
		System.out.println(sb.toString());
		calculateTime();
		sb = new StringBuilder();
		System.out.println("Iterative Variables :");
		startTime();
		for (int i = 0; i < n; i++) {
			sb.append(fibonacciVariables(i)).append(separator);
		}
		sb.setLength(sb.length() - separator.length());
		System.out.println(sb.toString());
		calculateTime();
	}

	public static void startTime() {
		startTime = System.nanoTime();
	}

	public static void calculateTime() {
		endTime = System.nanoTime();
		double duration = (double) (endTime - startTime) / 1000000000;
		System.out.println("Time taken : " + duration + " seconds");
	}

	public static long fibonacciRecursive(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static long fibonacciIterativeArray(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		long[] fib = new long[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}
	
	public static long fibonacciVariables(int n){
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		long x,x_1,x_2;
		x = 0;
		x_1 = 1;
		x_2 = 0;
		for(int i = 2; i <=n; i++){
			x = x_1 + x_2;
			x_2 = x_1;
			x_1 = x;
		}
		return x;
	}

}
