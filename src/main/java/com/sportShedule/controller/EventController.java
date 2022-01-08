package com.sportShedule.controller;

import com.sportShedule.entity.Event;
import com.sportShedule.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/admin/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    private Event create(@RequestBody Event event) {
        return eventService.save(event);
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Event findById(@PathVariable Long id) {
        return eventService.findById(id);
    }

    @GetMapping("/byCategoryId/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Collection<Event> findByCategoryId(@PathVariable Long id) {
        return eventService.findAllByCategoryId(id);
    }

    @GetMapping("/all")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Collection<Event> findAll() {
        return eventService.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private void removeById(@PathVariable Long id){
        eventService.remove(id);
    }

    @PostMapping("/byIds")
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    private Collection<Event> findByIds(@RequestBody Collection<Long> eventIds){
        return eventService.findAllByIds(eventIds);
    }
}
