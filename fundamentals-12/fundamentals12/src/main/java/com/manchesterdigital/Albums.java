package com.manchesterdigital;

import java.util.List;

public class Albums {
    private final String name;

    public Albums(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Albums ==> " + name;
    }
}
