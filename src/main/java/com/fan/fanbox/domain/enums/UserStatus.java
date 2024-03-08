package com.fan.fanbox.domain.enums;

public enum UserStatus {
    NORMAL(1),
    BANNED(2),
    DELETED(3);

    private final int status;

    UserStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}