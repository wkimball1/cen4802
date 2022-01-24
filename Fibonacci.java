public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fibinput = 10;
		long fiboutput = fib(10);
		System.out.println("The " + fibinput + "th term of the Fibonacci sequence is " + fiboutput + ".");
	}
	
	public static long fib(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
	   }

}
