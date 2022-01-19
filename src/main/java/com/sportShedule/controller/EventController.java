package com.sportShedule.controller;

import com.sportShedule.entity.Event;
import com.sportShedule.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/event")
@CrossOrigin(originPatterns = {"*"})
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Event findEventById(@PathVariable Long id) {
        return eventService.findById(id);
    }

    @GetMapping("/byCategoryId/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Collection<Event> findEventByCategoryId(@PathVariable Long id) {
        return eventService.findAllByCategoryId(id);
    }

    @GetMapping("/all")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Collection<Event> findAllEvents() {
        return eventService.findAll();
    }


    @PostMapping("/byIds")
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    private Collection<Event> findEventsByIds(@RequestBody Collection<Long> eventIds){
        return eventService.findAllByIds(eventIds);
    }
}
