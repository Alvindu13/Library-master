package com.library.svc.contracts;

import com.library.dao.model.User;
import com.library.validation.UserForm;

public interface UserSvc {

    void createClient(User user);
}
