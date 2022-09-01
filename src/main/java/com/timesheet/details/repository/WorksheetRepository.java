package com.timesheet.details.repository;

import com.timesheet.details.model.Worksheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorksheetRepository extends JpaRepository<Worksheet, Integer> {
}


