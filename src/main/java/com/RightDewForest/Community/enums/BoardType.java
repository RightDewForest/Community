package com.RightDewForest.Community.enums;

public enum BoardType {
    notice("NOTICE"),
    free("Free Talk");

    private String value;

    BoardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
