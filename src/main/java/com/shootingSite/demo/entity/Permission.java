package com.shootingSite.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {
    ADMIN_READ("ADMIN:read"),
    ADMIN_UPDATE("ADMIN:upade"),
    ADMIN_CREATE("ADMIN:create"),
    ADMIN_DELETE("ADMIN:delete"),
    MANAGMENT_READ("MANAGMENT:read"),
    MANAGMENT_UPDATE("MANAGMENT:upade"),
    MANAGMENT_CREATE("MANAGMENT:create"),
    MANAGMENT_DELETE("MANAGMENT:delete");

    @Getter
    private final String permission;
}
