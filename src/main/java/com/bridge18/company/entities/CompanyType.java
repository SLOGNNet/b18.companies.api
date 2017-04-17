package com.bridge18.company.entities;

public enum CompanyType {
    BROKER(0),
    FREIGHT_FORWARDER(1),
    SHIPPER(2),
    CARRIER(3);

    private final int value;

    CompanyType(int value) {
        this.value = value;
    }
}
