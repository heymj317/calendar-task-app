/*
 * References: https://www.geeksforgeeks.org/spring-boot-with-h2-database/
 */

package com.group3.calendar_task_app;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDateBetween(LocalDate startDate, LocalDate endDate);
    List<Event> findByCategory(String category);
    List<Event> findByRecurring(boolean recurring);
}

