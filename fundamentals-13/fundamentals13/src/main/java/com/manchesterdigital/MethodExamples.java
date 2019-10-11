package com.manchesterdigital;

public class MethodExamples {
    public static void main(String[] args) {
//        Cannot call nap here as it is not static. -> changed nap to be static & then back to non static
        try {
            MethodExamples examples = new MethodExamples();
            examples.nap(99);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public  final void nap(int minutes) throws IllegalArgumentException, IllegalStateException {
        //If minutes is final in the parameters field, that means the minutes parameter
        // cannot be changed inside the method
        if (minutes == 99) {
            throw new IllegalArgumentException();
        }
    }
}
