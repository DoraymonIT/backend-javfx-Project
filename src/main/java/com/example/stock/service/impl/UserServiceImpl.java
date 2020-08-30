package com.example.stock.service.impl;

import com.example.stock.Dao.UserDao;
import com.example.stock.bean.User;
import com.example.stock.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findByid(Long id) {
        if (userDao.findById(id).isPresent()) {
            return userDao.findById(id).get();
        } else
            return null;
    }

    @Override
    public User findByLibelle(String libelle) {
        return userDao.findByUserName(libelle);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int save(User user) {
        if (findByid(user.getId()) != null) {
            return -1;
        } else {
            userDao.save(user);
            return 1;
        }
    }

    @Override
    public int deleteById(Long id) {
        userDao.deleteById(id);
        if (findByid(id) == null) {
            return 1;
        } else
            return -1;
    }


}
