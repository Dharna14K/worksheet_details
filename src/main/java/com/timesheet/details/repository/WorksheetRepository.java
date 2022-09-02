package com.timesheet.details.repository;

import com.timesheet.details.entity.WorksheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorksheetRepository extends JpaRepository<WorksheetEntity, Integer> {
}


