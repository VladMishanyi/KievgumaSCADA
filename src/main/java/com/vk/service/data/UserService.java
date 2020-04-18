package com.vk.service.data;

import com.vk.entity.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by KIP-PC99 on 18.07.2018.
 */
public interface UserService extends UserDetailsService {

    void add(User user);

    void update(User user);

    User getAuthenticatedUser();

    boolean isAuthenticatedUser();

    User getByLogin(String login);

    boolean removeByLogin(String login);
}
