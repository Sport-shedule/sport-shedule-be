package com.sportShedule.controller;

import com.sportShedule.entity.Event;
import com.sportShedule.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/event")
@CrossOrigin(originPatterns = {"*"})
public class AdminEventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    private Event createEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private void removeEventById(@PathVariable Long id){
        eventService.remove(id);
    }
}
