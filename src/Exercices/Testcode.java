package Exercices;
import java.util.Scanner;
public class Testcode {

    static void printArray(int[] myArray) {
        for (int i = 0; i<myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
    }
    static boolean testPrim(int x) {
        boolean prim = true;
        int i = 2;
        int contorDiv = 0;
        while ((i <= x/2) && (contorDiv==0)){
            if (x%i==0) {
                contorDiv++;
                prim = false;
            }
            i++;
        }
        return prim;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Introduceti numarul n: ");
        int n = scanner.nextInt();
        System.out.print(" Introduceti numarul m: ");
        int m = scanner.nextInt();
        int [] a = new int[n];
        int contorPrim = 0;
        int i = m;
        while (contorPrim<n) {
            if (testPrim(i)) {
                a[contorPrim] = i;
                contorPrim++;
            }
            i++;
        }
        System.out.println(" Primele  " + n + " prime mai mari decat " + m + "  sunt:  ");
        // testPrim(n);
        printArray(a);
    }
}

