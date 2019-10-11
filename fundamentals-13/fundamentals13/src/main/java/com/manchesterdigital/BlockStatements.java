package com.manchesterdigital;

public class BlockStatements {
    public static void main(String[] args) {
        int number = 99;


        int coinInserted = 50;
        switch (coinInserted) {
            case 5:
            case 10:
            case 20:
                System.out.println("Need 50 inserted, you have inserted " + coinInserted);
                break;
            case 50:
                System.out.println("coinInserted = " + coinInserted);
                break;
            default:
                System.out.println("Should have a default value.");
        }
    }
}
