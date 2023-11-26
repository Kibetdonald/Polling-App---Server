package com.example.Polling.App.Services;

import com.example.Polling.App.Models.Response;
import com.example.Polling.App.Repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseServiceImpl implements ResponseService {

    private final ResponseRepository responseRepository;

    @Autowired
    public ResponseServiceImpl(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    @Override
    public List<Response> getAllResponses() {
        return responseRepository.findAll();
    }

    @Override
    public Response getResponseById(Long id) {
        Optional<Response> optionalResponse = responseRepository.findById(id);
        return optionalResponse.orElse(null);
    }

    @Override
    public Response saveResponse(Response response) {
        return responseRepository.save(response);
    }

    @Override
    public void deleteResponse(Long id) {
        responseRepository.deleteById(id);
    }
}
