/**
* Returns the nth term and the x value of the Fibonacci sequence
* the fib class is called recursively until the value is found.
*
* @param  long the term of fibonacci the user wants the value of
* @return long the value of the nth term
*/
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
