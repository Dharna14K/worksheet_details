package com.timesheet.details.service;

import com.timesheet.details.model.Worksheet;
import com.timesheet.details.model.WorksheetDetails;
import com.timesheet.details.repository.WorksheetDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetDetailsService {
    
        @Autowired
        WorksheetDetailsRepository worksheetDetailsRepository;

        public Optional<WorksheetDetails> getWorksheetDetails(Integer wsdetailsId) {
            return worksheetDetailsRepository.findById(wsdetailsId);
        }

        public List<WorksheetDetails> list() {
            return worksheetDetailsRepository.findAll();
        }

        public WorksheetDetails addWorksheetDetails(WorksheetDetails worksheetDetails) {
            return worksheetDetailsRepository.saveAndFlush(worksheetDetails);
        }


        public WorksheetDetails updateWorksheetDetails( WorksheetDetails worksheetDetails) {
            return worksheetDetailsRepository.saveAndFlush(worksheetDetails);
        }

        public void deleteWorksheetDetails( WorksheetDetails worksheetDetails) {
            worksheetDetailsRepository.delete(worksheetDetails);
        }

        public void deleteByWorksheetDetailsId(Integer wsdetailsId) {
            worksheetDetailsRepository.deleteById(wsdetailsId);
        }

    }


