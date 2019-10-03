package com.manchesterdigital;

public enum OrderStatus {
    PENDING("Order is Pending"),
    DISPATCHED("Order is dispatched"),
    DECLINED("Hahahahhahahaha, you've got no money"),
    AWAITING_PAYMENT("Gimme your money"),
    PROCESSED("Done");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
