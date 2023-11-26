package com.example.Polling.App.Services;

import com.example.Polling.App.Models.Response;

import java.util.List;

public interface ResponseService {
    List<Response> getAllResponses();

    Response getResponseById(Long id);

    Response saveResponse(Response response);

    void deleteResponse(Long id);
}
