package com.timesheet.details.repository;

import com.timesheet.details.model.Worksheet;
import com.timesheet.details.model.WorksheetDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorksheetDetailsRepository extends JpaRepository<WorksheetDetails, Integer> {
}


