package com.manchesterdigital;

public class ImprovedCarDealership {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0d;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);

        numberOfSales = 300;
        baseSalary = 250000;
        commissionRate = 2.0d;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);
    }

    private static void calcSalary(boolean taxYearEnded,
                                   int numberOfSales,
                                   int baseSalary,
                                   double commissionRate){
        if (taxYearEnded) {
            int bonus = 1000;
            double totalSalary = baseSalary;

            if (numberOfSales > 500) {
                totalSalary = baseSalary + (numberOfSales * commissionRate);
                totalSalary += bonus;
            }

            System.out.println("Total salary is: " + totalSalary);
        }

    }

}
