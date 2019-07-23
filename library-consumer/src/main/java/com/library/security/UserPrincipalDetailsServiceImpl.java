package com.library.security;

import com.library.dao.model.User;
import com.library.dao.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserPrincipalDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserPrincipalDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findUserByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}
