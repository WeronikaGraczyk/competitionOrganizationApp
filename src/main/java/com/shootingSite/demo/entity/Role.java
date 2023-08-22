package com.shootingSite.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static com.shootingSite.demo.entity.Permission.*;

@RequiredArgsConstructor
public enum Role {
    USER(Collections.emptySet()),
    ADMIN(Set.of(
            ADMIN_READ,
            ADMIN_UPDATE,
            ADMIN_CREATE,
            ADMIN_DELETE,
            MANAGMENT_READ,
            MANAGMENT_UPDATE,
            MANAGMENT_CREATE,
            MANAGMENT_DELETE
    )),
    MANAGER(Set.of(
            MANAGMENT_READ,
            MANAGMENT_UPDATE,
            MANAGMENT_CREATE,
            MANAGMENT_DELETE
    ));

    @Getter
    private final Set<Permission> permissions;


    public List<SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authories = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .toList();
        authories.add(new SimpleGrantedAuthority("ROle:"+this.name()));
        return authories;
    }
}
