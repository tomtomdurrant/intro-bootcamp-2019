package com.manchesterdigital;

public interface IsChargeable {
    void supercharge();

    default void describe(){
        System.out.println("I'm green");
    }
}
