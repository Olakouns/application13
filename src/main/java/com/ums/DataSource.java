package com.ums;

import com.ums.model.Role;
import com.ums.model.RoleEnum;
import com.ums.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private ObservableList<User> users = FXCollections.observableArrayList();
    private List<Role> roles = new ArrayList<>(List.of(new Role("Utilisateur", RoleEnum.SIMPLE_USER), new Role("Utilisateur", RoleEnum.ADMINISTRATEUR)));


    public DataSource() {
        users.add(new User("Dior", "Ndeye", "ndeye@gmail.com", "773456784", roles.get(0)));
        users.add(new User("KOUNASO", "Lazare", "kouns@gmail.com", "785900131", roles.get(0)));
        users.add(new User("Dior", "Ndeye", "ndeye@gmail.com", "773456784", roles.get(0)));
        users.add(new User("Dior", "Ndeye", "ndeye@gmail.com", "773456784", roles.get(1)));
        users.add(new User("ADJAVI", "Jean", "jean@gmail.com", "785600245", roles.get(0)));
        users.add(new User("Dior", "Ndeye", "ndeye@gmail.com", "773456784", roles.get(1)));
        users.add(new User("Dior", "Ndeye", "ndeye@gmail.com", "773456784", roles.get(0)));
    }

    public ObservableList<User> getUsers () {
        return users;
    }
}
