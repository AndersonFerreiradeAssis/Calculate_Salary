package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String employeeName;
        String employeePosition;
        Double numberOFWorkedHours;
        Double paymentForHour;
        Double employeePayment;
        Double taxDiscount;
        Double DiscountCalculate;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Write Employee Name:");
        employeeName = sc1.nextLine();
        System.out.println("Write Employee Position:");
        employeePosition = sc1.nextLine();
        System.out.println("Write Number of Worked Hours:");
        numberOFWorkedHours = sc1.nextDouble();
        System.out.println("Write amount money per Hour:");
        paymentForHour = sc1.nextDouble();
        System.out.println("Write Tax Per Cent Discount:");
        taxDiscount = sc1.nextDouble();

        DiscountCalculate = (numberOFWorkedHours * paymentForHour) * (taxDiscount/100);
        employeePayment = (numberOFWorkedHours * paymentForHour) - DiscountCalculate;
        System.out.println("Employee Name: " + employeeName + " Employee Position: " + employeePosition);
        System.out.println("Tax Discount: " + DiscountCalculate);
        System.out.println("Total Salary: " + employeePayment);



    }
}
