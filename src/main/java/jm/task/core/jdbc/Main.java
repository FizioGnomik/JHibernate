package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Майкл", "Джордан", (byte) 60);
        userService.saveUser("Леброн", "Джеймс", (byte) 38);
        userService.saveUser("Стефен", "Карри", (byte) 35);
        userService.saveUser("Шакил", "О`Нил", (byte) 51);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
