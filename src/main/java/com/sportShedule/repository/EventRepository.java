package com.sportShedule.repository;

import com.sportShedule.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

     Collection<Event> findByCategoryId(Long categoryId);
}
