package com.bridge18.company.entities;

public enum ContactInfoType {
    NONE(0),
    PHONE(1),
    FAX(2),
    EMAIL(3);

    private final int value;

    ContactInfoType(int value) {
        this.value = value;
    }
}