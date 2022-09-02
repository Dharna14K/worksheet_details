package com.timesheet.details.service;

import com.timesheet.details.entity.WorksheetDetailsEntity;
import com.timesheet.details.repository.WorksheetDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetDetailsService {
    
        @Autowired
        WorksheetDetailsRepository worksheetDetailsRepository;

        public Optional<WorksheetDetailsEntity> getWorksheetDetails(Integer wsdetailsId) {
            return worksheetDetailsRepository.findById(wsdetailsId);
        }

        public List<WorksheetDetailsEntity> list() {
            return worksheetDetailsRepository.findAll();
        }

        public WorksheetDetailsEntity addWorksheetDetails(WorksheetDetailsEntity worksheetDetails) {
            return worksheetDetailsRepository.saveAndFlush(worksheetDetails);
        }


        public WorksheetDetailsEntity updateWorksheetDetails( WorksheetDetailsEntity worksheetDetails) {
            return worksheetDetailsRepository.saveAndFlush(worksheetDetails);
        }

        public void deleteWorksheetDetails( WorksheetDetailsEntity worksheetDetails) {
            worksheetDetailsRepository.delete(worksheetDetails);
        }

        public void deleteByWorksheetDetailsId(Integer wsdetailsId) {
            worksheetDetailsRepository.deleteById(wsdetailsId);
        }

    }


