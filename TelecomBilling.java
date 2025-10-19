/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.telecombilling;

/**
 *
 * @author VU-STUDENT
 */
public class TelecomBilling {
     public static void main(String[] args) {
        // Step 1: Initialize variables
        double airtimeLoaded = 10000;   // UGX
        double loadingChargePercent = 10; // 10%
        int callRatePerSecond = 200;    // UGX per second
        int callDurationMinutes = 5;    // call duration in minutes

        // Step 2: Calculate loading charge
        double loadingCharge = (loadingChargePercent / 100) * airtimeLoaded;
        double balanceAfterLoad = airtimeLoaded - loadingCharge;

        // Step 3: Calculate call cost
        int callDurationSeconds = callDurationMinutes * 60; // convert to seconds
        double callCost = callDurationSeconds * callRatePerSecond;

        // Step 4: Calculate final balance
        double finalBalance = balanceAfterLoad - callCost;

        // Step 5: Display results
        System.out.println("Airtime Loaded: UGX " + airtimeLoaded);
        System.out.println("Loading Charge (10%): UGX " + loadingCharge);
        System.out.println("Balance after loading charge: UGX " + balanceAfterLoad);
        System.out.println("Call duration: " + callDurationMinutes + " minutes (" + callDurationSeconds + " seconds)");
        System.out.println("Call cost: UGX " + callCost);
        System.out.println("Final balance: UGX " + finalBalance);
    }
}

    