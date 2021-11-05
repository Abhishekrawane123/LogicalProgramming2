package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber
{
    
    public static void main(String[] args)
    {
        PerfectNumber aNumberTheoryUtil = new PerfectNumber();
                
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner sc = new Scanner(System.in);
        if ( ! sc.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = sc.nextInt();
        
        if (upperBound < 0) {
            System.out.println("Upper bound is not positive. Please try again.");
            return;
        }
        
        System.out.println("These numbers are perfect:");
        int countPerfectNumbers   = 0;
        for (int i = 1; i <= upperBound; i++) {
            if ( ! aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countPerfectNumbers++;
        }
        System.out.printf("\n[%1$d perfect numbers found (%2$.2f%%)]\n",
                countPerfectNumbers, ((double)100 * countPerfectNumbers/upperBound)
        );
        
        System.out.println();
        
        System.out.println("These numbers are neither deficient nor perfect:");
        int countDeficientNumbers = 0;
        for (int i = 1; i <= upperBound; i++) {
            if ( aNumberTheoryUtil.isDeficient(i) || aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countDeficientNumbers++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n",
                countDeficientNumbers, ((double)100 * countDeficientNumbers/upperBound)
        );     
    }
    
    // return true if the number is perfect
    private boolean isPerfect(int posInt)
    {
        int sumDivisors = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisors += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisors == posInt);
    }
    
    // return true if the number is deficient
    private boolean isDeficient(int posInt)
    {
        int sumDivisors = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisors += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisors < posInt);
    }     
}

