package com.example.stock.service.facade;

import com.example.stock.bean.User;

import java.util.List;

public interface UserService {
    User findByid(Long id);

    User findByLibelle(String libelle);

    List<User> findAll();

    int save(User user);

    int deleteById(Long id);
}
