package com.manchesterdigital;

public class MethodOverloadingExample {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply (int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodOverloadingExample me = new MethodOverloadingExample();
        int result = me.multiply(3, 3);
        System.out.println(result);
        result = me.multiply(3,3,3);
        System.out.println(result);


    }
}
