package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.User;

public interface UserService {
	User findByid(Long id);
	User findByLibelle(String libelle);
	List<User> findAll();
	int save(User user);
	int deleteById(Long id);
}
