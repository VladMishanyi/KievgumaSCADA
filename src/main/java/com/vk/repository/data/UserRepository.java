package com.vk.repository.data;

import com.vk.entity.user.User;

/**
 * Created by KIP-PC99 on 18.07.2018.
 */
public interface UserRepository extends RootRepositoryData<User> {

    User findByLogin(String login);

    User deleteByLogin(String login);
}
