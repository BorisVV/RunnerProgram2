package com.BorisV.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numOfTimes;
        double[] times;
        String lakeName;
        List<Double> allTimes = new ArrayList<>();
        List<String> lakes = new ArrayList<>();
        Map<String, ArrayList<Double>> runner = new HashMap<>();

        do {
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
                System.out.println("Enter the times #" + counter);
                times[i] = in.nextDouble();
                if (lakes.contains(lakeName)) {
                    allTimes.add(times[i]);
                    runner.put(lakeName, (ArrayList<Double>)allTimes);
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


        } while (doYouWantToCont());


    }

    public static boolean doYouWantToCont() {
        Scanner in = new Scanner(System.in);
        String y;
        System.out.println("\nWould you like to add another lake? (y/n)");
        y = in.next();
        if (y.equalsIgnoreCase("Y"))
            return true;
        else return false;
    }
}


