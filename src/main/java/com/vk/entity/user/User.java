package com.vk.entity.user;

import com.vk.entity.table.TableModel;
import com.vk.enumeration.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public final class User extends TableModel implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "locked", nullable = false)
    private boolean locked;

    public User() {
    }

    public User(
            final String name,
            final String login,
            final String password,
            final String description,
            final UserRole role,
            final boolean locked
    ) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.description = description;
        this.role = role;
        this.locked = locked;

    }

    public User(
            final Date date,
            final String name,
            final String login,
            final String password,
            final String description,
            final UserRole role,
            final boolean locked
    ) {
        this.setDate(date);
        this.name = name;
        this.login = login;
        this.password = password;
        this.description = description;
        this.role = role;
        this.locked = locked;

    }

    public User(
            final long id,
            final Date date,
            final String name,
            final String login,
            final String password,
            final String description,
            final UserRole role,
            final boolean locked
    ) {
        super(id, date);
        this.name = name;
        this.login = login;
        this.password = password;
        this.description = description;
        this.role = role;
        this.locked = locked;

    }

    @Override
    public String toString() {
        return "User{" + super.toString() +
                ", name='" + this.name + '\'' +
                ", login='" + this.login + '\'' +
                ", password='" + this.password + '\'' +
                ", description='" + this.description + '\'' +
                ", role=" + this.role +
                ", isLocked=" + this.locked +
                '}';
    }

    @Override
    public boolean equals(final Object object) {
        boolean result = false;
        if (super.equals(object)) {
            final User other = (User) object;
            result = this.name.equalsIgnoreCase(other.name) &&
                    this.description.equalsIgnoreCase(other.description) &&
                    this.role.equals(other.role);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() +
                this.description.hashCode() +
                this.role.hashCode();
    }

    @Override
    public User clone() {
        return (User) super.clone();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        final List<GrantedAuthority> roles = new ArrayList<>(1);
        roles.add(new SimpleGrantedAuthority("ROLE_" + this.role.name()));
        return roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !isLocked();
    }

    @Override
    public boolean isAccountNonLocked() {
        return !isLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !isLocked();
    }

    @Override
    public boolean isEnabled() {
        return !isLocked();
    }

    public String getName() {
        return this.name;
    }

    public String getLogin() {
        return this.login;
    }

    public String getDescription() {
        return this.description;
    }

    public UserRole getRole() {
        return this.role;
    }
    public boolean isLocked() {
        return this.locked;
    }
}


