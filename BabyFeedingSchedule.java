/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.babyfeedingschedule;

/**
 *
 * @author VU-STUDENT
 */
public class BabyFeedingSchedule {
public static void main(String[] args) {
        // Step 1: Define constants
        double porridgeAvailable = 2.0; // liters
        double milkAvailable = 2.0;     // liters
        double porridgeCup = 0.5;       // liters per feed
        double milkCup = 1.0;           // liters per feed
        int porridgeInterval = 45;      // minutes
        int milkInterval = 30;          // minutes

        // Step 2: Initialize counters
        int totalTime = 0;

        // Step 3: Feed porridge
        while (porridgeAvailable > 0) {
            porridgeAvailable -= porridgeCup; // feed baby
            totalTime += porridgeInterval;    // add waiting time
        }

        // Step 4: Feed milk
        while (milkAvailable > 0) {
            milkAvailable -= milkCup; // feed baby
            totalTime += milkInterval; // add waiting time
        }

        // Step 5: Display result
        System.out.println("Total time to finish porridge and milk: " + totalTime + " minutes");
        System.out.println("Or approximately " + (totalTime / 60.0) + " hours");
    }
}
