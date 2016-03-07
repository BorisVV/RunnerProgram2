package com.BorisV.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numOfTimes;
        double[] times;
        String lakeName;
        List<Double> allTimes = new ArrayList<>();
        List<String> lakes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the Lake");
        lakeName = in.nextLine();
        System.out.println("How many time did you run around lake " + lakeName);
        numOfTimes = in.nextInt();
        times = new double[numOfTimes];
        double min;
        int counter = 0;
        for (int i = 0; i < times.length; i++) {
            counter++;
            System.out.println("Enter the times " + counter);
            times[i] = in.nextDouble();
                if (lakes.contains(lakeName)) {
                    allTimes.add(times[i]);
                } else {
                    lakes.add(lakeName);
                    allTimes.add(times[i]);
                }

        }
        min = times[0];
        for (double t : times) {
            if (min > t) min = t;
            System.out.println(lakeName + " " + t);
        }

        System.out.println("The best time for lake: \n" + lakeName + " " + min);


    }
}

