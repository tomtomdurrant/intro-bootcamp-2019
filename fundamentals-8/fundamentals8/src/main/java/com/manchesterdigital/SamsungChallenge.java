package com.manchesterdigital;

public class SamsungChallenge {

    private static boolean phoneStatus;

    public static boolean turnPhoneOn(){
        phoneStatus = true;
        return phoneStatus;
    }
    public static boolean turnPhoneOff(){
        phoneStatus = false;
        return phoneStatus;
    }

    public static void call(String name) {
        if (phoneStatus) {
            System.out.println("Calling " + name);
        }
    }

    public static void text(String name, String message) {
        if (phoneStatus) {
            System.out.println("Texting " + name);
            System.out.println(message);
        }
    }

    public static void takePhoto() {
        if (phoneStatus) {
            System.out.println("Photo taken");
        }
    }

    public static void openBrowser(String website) {
        if (phoneStatus) {
            System.out.println("Opening website " + website);
        }
    }

    public static void main(String[] args) {
        turnPhoneOn();
        openBrowser("google.com");
        takePhoto();
        turnPhoneOff();
    }
}
