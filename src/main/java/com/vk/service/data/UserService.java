package com.vk.service.data;

import com.vk.entity.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by KIP-PC99 on 18.07.2018.
 */
public interface UserService extends UserDetailsService {

    void add(User user);

    void update(User user);

    User getAuthenticatedUser();

    User getByLogin(String login);

    List<User> findAll();

    boolean isAuthenticatedUser();

    boolean removeByLogin(String login);
}
