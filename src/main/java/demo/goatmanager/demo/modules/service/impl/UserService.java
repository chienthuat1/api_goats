package demo.goatmanager.demo.service.impl;

import demo.goatmanager.demo.modules.entity.Users;
import demo.goatmanager.demo.repository.UserRepository;
import demo.goatmanager.demo.service.BaseService;
import demo.goatmanager.demo.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends BaseService implements UserServiceInterface {
    @Autowired
    UserRepository user_repository;

    public List<Users> user_list(){
        return user_repository.findAll();
    }

}
