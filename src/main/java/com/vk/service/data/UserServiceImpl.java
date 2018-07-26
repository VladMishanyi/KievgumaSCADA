package com.vk.service.data;

import com.vk.entity.user.User;
import com.vk.repository.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.vk.lib.ObjectValidator;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;

/**
 * Created by KIP-PC99 on 18.07.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class UserServiceImpl implements UserDetailsService, UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = null;
        try {
            if (ObjectValidator.isNotNull(s)){
                user = userRepository.findByLogin(s);
            }
        } catch (Exception e){
            user = null;
        }
        return user;
    }

    @Override
    @Transactional
    public void add(User user) {
        if (ObjectValidator.isNotNull(user)){
            userRepository.save(user);
        }
    }

    @Override
    @Transactional
    public void update(User user) {
        if (ObjectValidator.isNotNull(user)){
            userRepository.save(user);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public User getAuthenticatedUser(){
        User user;
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            user = (User) authentication.getPrincipal();
        } catch (Exception e){
            user = null;
        }
        return user;
    }

    @Override
    public boolean isAuthenticatedUser() {
        final User user = getAuthenticatedUser();
        return ObjectValidator.isNotNull(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getByLogin(String login){
        User user = null;
        try {
            if (ObjectValidator.isNotNull(login)){
                userRepository.findByLogin(login);
            }

        } catch (Exception e){
            user =null;
        }
        return user;
    }

    @Override
    @Transactional
    public boolean removeByLogin(String login){
        User user;
        boolean chaker = false;
        try {
            user = getByLogin(login);
            userRepository.delete(user);
            chaker = true;

        } catch (Exception e){
            chaker = false;
        }
        return chaker;
    }
}
