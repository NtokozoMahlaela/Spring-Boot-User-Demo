package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.Test;

public class UserServiceTests {

    @Test
    public void testAddUser() {
        UserService userService = new UserServiceImpl(new FakeRepo());
        userService.addUser("Ntokozo", "Mahlaela");
    }

    @Test
    public void testGetUser() {
        UserServiceImpl service = new UserServiceImpl(new FakeRepo());
        service.addUser("Musa", "Ndima");
        service.getUser(1);
    }

    @Test
    public void testRemoveUser() {
        UserServiceImpl service = new UserServiceImpl(new FakeRepo());
        service.addUser("Tshidi", "Mkhwanazi");
        service.removeUser(1);
    }
}
