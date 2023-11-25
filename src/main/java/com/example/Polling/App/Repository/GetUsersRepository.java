package com.example.Polling.App.Repository;

import com.example.Polling.App.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GetUsersRepository extends JpaRepository<User, Integer> {

}