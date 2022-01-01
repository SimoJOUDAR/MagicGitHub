package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // Modifié

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // Modifié
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Modifié
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Modifié
        apiService.deleteUser(user);
    }
}
