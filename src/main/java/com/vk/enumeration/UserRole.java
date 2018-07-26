package com.vk.enumeration;

import java.util.Arrays;


public enum UserRole {

    SUPERADMIN,

    ADMIN,

    CLIENT,

    ANOTHER;

    public static UserRole[] getEnumConstants() {
        final UserRole[] roles = UserRole.class.getEnumConstants();
        return Arrays.copyOfRange(roles, 1, roles.length);
    }
}
