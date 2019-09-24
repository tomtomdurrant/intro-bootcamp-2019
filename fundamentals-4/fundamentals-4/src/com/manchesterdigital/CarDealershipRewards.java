package com.manchesterdigital;

public class CarDealershipRewards {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0d;
        int bonus = 1000;

        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commissionRate);

            if (numberOfSales > 500) {
                totalSalary += bonus;
            }
        }

        numberOfSales = 300;
        baseSalary = 250000;
        commissionRate = 2.0d;

        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commissionRate);
            System.out.println("Total salary is: +" + totalSalary);
        }
    }
}
