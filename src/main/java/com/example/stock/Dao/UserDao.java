package com.example.stock.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
User findByUserName(String userName);
}
