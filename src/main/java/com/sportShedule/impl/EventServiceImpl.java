package com.sportShedule.impl;

import com.sportShedule.entity.Event;
import com.sportShedule.repository.EventRepository;
import com.sportShedule.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event findById(Long id) {
        return eventRepository.findById(id).orElseThrow(
                ()->new RuntimeException("couldn't find event by id - "+id)
        );
    }

    @Override
    public Collection<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Collection<Event> findAllByCategoryId(Long id) {
        return eventRepository.findByCategoryId(id);
    }
}
