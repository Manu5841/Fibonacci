/**
 Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for  multiples of 5, print "Buzz";
 and for numbers that are multiples of both 3 and 5, print  "FizzBuzz".
 */

public class Fizzbuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     write a program to generate the Fibonacci sequence upto 100
     **/

    public static class Fibonacci {

        public static void main(String[] args) {

            int firstTerm = 0, secondTerm = 1;
            int nextTerm;

            System.out.print("Fibonacci Series upto 100: ");
            for (int i = 1; i <= 100; ++i) {
                System.out.print(firstTerm + " ");
                nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

        public static boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;
            }
            while (n % 2 == 0) {
                n /= 2;
            }
            return n == 1;
        }
    }