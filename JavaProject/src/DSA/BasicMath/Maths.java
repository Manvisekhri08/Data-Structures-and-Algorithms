package DSA.BasicMath;

import java.util.Scanner;

public class Maths {
    /*
     * N = 7789
     * print all the digits
     */
    void digits(int N) {
        while (N > 0) {
            int lastDigit = N % 10;
            System.out.println(lastDigit);
            N = N / 10;
        }
    }

    /*
     * count digits
     * N = 7789
     * o/p :- 4
     * Time complexity = O(log10(N)) as its getting division of 10
     */
    void countDigits(int N) {
        int count = 0, lastDigit;
        while (N > 0) {
            lastDigit = N % 10;
            count++;
            N = N / 10;
        }
        System.out.println("Count is: " + count);
    }

    /*
     * Reverse a number and if number has smth like 10400 the reverse won't be 00401
     * but 401
     * N = 1234
     * O/p ;- 4321
     * N = 7890
     * O/p:- 987
     */
    void reverse(int N) {
        int rev = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            N = N / 10;
            rev = (rev * 10) + lastDigit; // 1 :- 9 0*10 + 9 = 9 and after when we get lastDgit = 8 then rev = 9*10+8 =
                                          // 98 as
        }
        System.out.print("Reverse of given number is : " + rev);
    }

    /*
     * Check if number is a palindrome
     * N = 121
     * O/p :- true
     * N = 123
     * O/p:- false
     */
    void palindrome(int N) {
        int rev = 0, copyN = N;
        while (N > 0) {
            int lastDigit = N % 10;
            N /= 10;
            rev = (rev * 10) + lastDigit;
        }
        if (rev == copyN) {
            System.out.println("Yes number is palindrome");
        } else {
            System.out.println("No number is not a palindrome");
        }
    }

    /*
     * Check if number is a armstrong :- when each of its digits is raised to the
     * power of the number of digits in the number and sums of them equal to the og
     * number
     * N = 371
     * O/p :- yes because 3^3 + 7^3 + 1^3 = 371
     * N = 170
     * O/p:- false because 1^3 + 7^3 + 0^3 = 346
     * N = 1634
     * O/p:- yes because 1^4 + 6^4 + 3^4 + 4^4 = 1634
     */

    void armstrong(int N) {
        int sum = 0, count = 0, temp = N;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        // making copy of og number
        temp = N;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, count);
            temp /= 10;
        }
        if (N == sum) {
            System.out.println("Yes number is an armstrong");
        } else {
            System.out.println("No number is not an armstrong");
        }
    }

    /*
     * Print all divisors
     * I/P :- 36
     * O/p :- 1,2,3,4,6,,9,12,18,36
     * here TC :- O(n)
     */

    void divisors(int N) {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println("All divisors of given number is: " + i);
            }
        }
    }

    /*
     * Optimised divisor
     * 36
     * 1 x 36 = 36
     * 2 x 18 = 26
     * 3 x 12 = 36
     * 4 x 9 = 36
     * 6 x 6 = 36 ----> sqrt(36)
     * 9 x 4 = 36 ----> repeating
     * 12 x 2 = 36
     * 18 x 2 = 36
     * 36 x 1 = 36
     * using list we can sort this divisors
     */

    void divisorsOptimised(int N) {
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println("All divisors of given number is: " + i);
                if (N / i != i) {
                    System.out.println("All divisors of given number is: " + N / i);
                }
            }
        }
    }

    /*
     * Prime
     */

    void primeBrute(int N) {
        int count = 0;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Yes number is a prime number ");
        } else {
            System.out.println("No number is not a prime number ");
        }
    }

    void primeOptimised(int N) {
        int count = 0;
        for (int i = 1; i * i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                count++;
                if ((N / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("Yes number is a prime number ");
        } else {
            System.out.println("No number is not a prime number ");
        }
    }

    /*
     * GCD / HCF
     */
    void gcdBrute(int N1, int N2) {
        int gcd = 1;
        for(int i = 1; i<= Math.min(N1, N2); i++) {
            if(N1%i == 0 && N2 %i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is " + gcd);
    }

    void gcdOptimised(int N1, int N2) {
        if(N1 > 0 && N2 > 0) {
            if(N1 > N2) {
                N1 = N1 % N2;
            } else {
                N2 = N2 % N1;
            }
        }
        if(N1 == 0) {
            System.out.println("GCD is " + N2);
        }
        System.out.println("GCD is " + N1);
    }

    /**
     * 
     * Power Exponential
     */
    int power(int pow, int base) {
        int ans = 1;
        while(base > 0) {
            if(pow % 2 == 1) {
                ans = ans*base;
                pow = pow-1;
            } else {
                pow =  pow/2;
                base = base * base;
            }
        }
        if(pow < 0) {
            ans = 1/ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N = scanner.nextInt();
        int N2 = scanner.nextInt();
        Maths math = new Maths();
       // math.primeOptimised(N);
        int result = math.power(N,N2);
        //math.gcdOptimised(N, N2);
        System.out.println(result);
        scanner.close();
    }
}
