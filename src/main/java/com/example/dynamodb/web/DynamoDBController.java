package com.example.dynamodb.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DynamoDBController {


  @RequestMapping(value = "/retrieveAllMovies", method = RequestMethod.GET)
  public ResponseEntity<Map<String, Object>> retrieveAllMovies(@RequestHeader HttpHeaders headers) {
    return null;
  }
}
