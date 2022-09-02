package com.timesheet.details.service;

import com.timesheet.details.entity.WorksheetEntity;
import com.timesheet.details.repository.WorksheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetService {

    @Autowired
    WorksheetRepository worksheetRepository;

    public Optional<WorksheetEntity> getWorksheet(Integer worksheetId) {
        return worksheetRepository.findById(worksheetId);
    }

    public List<WorksheetEntity> list() {
        return worksheetRepository.findAll();
    }

    public WorksheetEntity addWorksheet(WorksheetEntity worksheetEntity) {
        return worksheetRepository.saveAndFlush(worksheetEntity);
    }


    public WorksheetEntity updateWorksheet(WorksheetEntity worksheetEntity) {
        return worksheetRepository.saveAndFlush(worksheetEntity);
    }

    public void deleteWorksheet(WorksheetEntity worksheetEntity) {
        worksheetRepository.delete(worksheetEntity);
    }

    public void deleteByWorksheetId(Integer worksheetId) {
        worksheetRepository.deleteById(worksheetId);
    }

}
