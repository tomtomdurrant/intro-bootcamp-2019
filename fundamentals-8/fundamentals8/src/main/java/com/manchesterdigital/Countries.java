package com.manchesterdigital;

public enum Countries {

    GERMANY_ALT("Germany"),
    GERMANY("Germany", "de"),
    SPAIN("Spain", "es");

    private String name;
    private String isoCode;

    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
    }

    Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
