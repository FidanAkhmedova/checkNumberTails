package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 9.010d;
        long myInt = (long) a;
        double difference = a - (double) myInt;
        if (difference == 0) System.out.println("The number has no tails, difference EQ " + difference);
        else System.out.println("The number has tails, difference EQ " + difference);

    }
}
