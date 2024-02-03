package com.example.springapi.service;
import com.example.springapi.api.controller.UserController;
import com.example.springapi.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1,"Vinay",26,"vinay@gmail.com");
        User user2 = new User(2,"User2",26,"vinay@gmail.com");
        User user3 = new User(3,"User3",26,"vinay@gmail.com");
        User user4 = new User(4,"User4",26,"vinay@gmail.com");
        User user5 = new User(5,"User5",26,"vinay@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }
    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user:userList){
            if(id == user.getId()){
                optional=optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
