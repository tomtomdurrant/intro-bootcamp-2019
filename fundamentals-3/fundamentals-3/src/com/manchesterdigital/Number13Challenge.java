package com.manchesterdigital;

public class Number13Challenge {

    public static void main(String[] args) {
        luckySum(1, 2, 3);
        luckySum(1, 2, 13);
        luckySum(1, 13, 2);
    }

    private static void luckySum(int a, int b, int c) {
        int result = 0;
        if (a == 13) {
            result = 0;
        } else if (b == 13){
            result = a;
        } else if (c == 13) {
            result = a + b;
        } else {
            result = a + b + c;}
        System.out.println(result);
    }
}
