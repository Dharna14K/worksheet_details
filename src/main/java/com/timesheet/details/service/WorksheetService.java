package com.timesheet.details.service;

import com.timesheet.details.model.Worksheet;
import com.timesheet.details.repository.WorksheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetService {
    @Autowired
    static
    WorksheetRepository worksheetRepository;

    public Optional<Worksheet> getWorksheet(Integer worksheetId) {
        return worksheetRepository.findById(worksheetId);
    }

    public static List<Worksheet> list() {
        return worksheetRepository.findAll();
    }

    public Worksheet addWorksheet(Worksheet worksheet) {
        return worksheetRepository.saveAndFlush(worksheet);
    }


    public Worksheet updateWorksheet( Worksheet worksheet) {
        return worksheetRepository.saveAndFlush(worksheet);
    }

    public void deleteWorksheet( Worksheet worksheet) {
        worksheetRepository.delete(worksheet);
    }

    public void deleteByWorksheetId(Integer worksheetId) {
        worksheetRepository.deleteById(worksheetId);
    }

}
