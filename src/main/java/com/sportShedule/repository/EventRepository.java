package com.sportShedule.repository;

import com.sportShedule.entity.Event;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

     Collection<Event> findByCategoryId(Long categoryId);

     @Query(
             value = "SELECT * FROM Event e WHERE e.id in (?1)",
             nativeQuery = true)
     Collection<Event> findAllByIds(@NotNull Collection<Long> id);

}
