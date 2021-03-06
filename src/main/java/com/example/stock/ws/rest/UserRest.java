package com.example.stock.ws.rest;

import com.example.stock.Dao.UserDao;
import com.example.stock.bean.User;
import com.example.stock.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/user-Api/User/")
public class UserRest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @GetMapping("findByid/id/{id}")
    public User findByid(@PathVariable Long id) {
        return userService.findByid(id);
    }

    @GetMapping("findByLibelle/libelle/{libelle}")
    public User findByLibelle(@PathVariable String libelle) {
        return userService.findByLibelle(libelle);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("save")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("deleteById/id/{id}")
    public int deleteById(@PathVariable Long id) {
        return userService.deleteById(id);
    }

}
