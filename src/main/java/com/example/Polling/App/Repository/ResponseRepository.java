package com.example.Polling.App.Repository;

import com.example.Polling.App.Models.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}
