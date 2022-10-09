package com.activitytimer.timer.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timer")
@CrossOrigin
public class TimerController {

    @GetMapping
    public String getAll() {
        return "list of timers";
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id") String id) {
        return String.format("specific timer with id: %s", id);
    }

    @PostMapping
    public ResponseEntity<Created> createTimer(@RequestBody Created created) {
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteTimer(@PathVariable String id) {
        return String.format("{ message: deleted timer with id: %s }", id);
    }
}