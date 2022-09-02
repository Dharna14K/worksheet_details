package com.timesheet.details.repository;

import com.timesheet.details.entity.WorksheetDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorksheetDetailsRepository extends JpaRepository<WorksheetDetailsEntity, Integer> {
}


