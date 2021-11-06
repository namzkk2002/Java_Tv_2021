package Bai5;

import java.util.Scanner;

public class RunMain {
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(long n){
        if (n < 2) {
            return false;
        }
        long squareRoot = (long) Math.sqrt(n);
        for (long i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(float n){
        if(n!=(int)n){
            return false;
        }
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(double n){
        if(n!=(int)n){
            return false;
        }
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        long x =
        System.out.println(isPrime(3.0f));
    }
}
