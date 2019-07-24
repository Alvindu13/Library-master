package com.library.svc.svcImpl;

import com.library.dao.model.User;
import com.library.dao.repository.UserRepository;
import com.library.svc.contracts.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSvcImpl implements UserSvc {


    @Autowired
    private UserRepository repo;

    @Override
    public void createClient(User user) {
        repo.save(user);

    }
}
