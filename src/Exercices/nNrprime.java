package Exercices;

import java.util.Scanner;

public class nNrprime {

    static int primeTest(int n) {
        int i;
        boolean isPrime = true;
        for (i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            return n;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.print("N= ");
        n = scanner.nextInt();
        System.out.print("M= ");
        m = scanner.nextInt();
        int cont = 0;
        while (cont < n) {
            if (primeTest(m) != 0) {
                System.out.print(m + ", ");
                cont++;
                m++;
            } else m++;
        }
        System.out.println("Code compiled succesfuly.");

    }

}
