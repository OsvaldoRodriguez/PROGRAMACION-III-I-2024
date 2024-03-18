package javaapplication1;

import java.util.Collections;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 1  
        int n = in.nextInt();                   // 1
        int A[] = new int[n + 1];               // 1
        for(int i = 0; i < n; i++) {            // n + 1
            for(int j = i + 1; j < n; j++) {    // n * ((n - 1) + 1)
                if (A[i] > A[j]) {              // n * (n - 1)
                    int aux = A[i];             // n * (n - 1)
                    A[i] = A[j];                // n * (n - 1)
                    A[j] = aux;                 // n * (n - 1)
                }
            }
        }               
        // T(n) = 4 + n + 4n^2 - 4n + n^2
        // T(n) = 5n^2 - 3n + 4
        // O(T(n)) = 5n^2
        // O(n) = n^2
        
    }
}
