package org.demo;

import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // n is divisible by i
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt(); // Read user input

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
