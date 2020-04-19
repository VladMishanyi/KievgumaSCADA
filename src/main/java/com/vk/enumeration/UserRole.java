package com.vk.enumeration;

import java.util.Arrays;
import java.util.Optional;


public enum UserRole {

    SUPERADMIN,

    ADMIN,

    CLIENT,

    ANOTHER;

    public static boolean containRole(String role){
        UserRole[] userRoles = UserRole.values();
        Optional<UserRole> userResult = Arrays.stream(userRoles).filter(r -> r.toString().equals(role)).findFirst();
        return userResult.isPresent();
    }

    public static UserRole[] getEnumConstants() {
        final UserRole[] roles = UserRole.class.getEnumConstants();
        return Arrays.copyOfRange(roles, 1, roles.length);
    }
}
