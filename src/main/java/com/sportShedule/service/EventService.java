package com.sportShedule.service;

import com.sportShedule.entity.Event;

import java.util.Collection;

public interface EventService {

    Event save(Event event);
    Event findById(Long id);
    Collection<Event> findAll();
    Collection<Event> findAllByCategoryId(Long id);
    void remove(Long id);
    Collection<Event> findAllByIds(Collection<Long> ids);
}
