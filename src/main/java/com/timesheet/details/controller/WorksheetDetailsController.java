package com.timesheet.details.controller;

import com.timesheet.details.entity.WorksheetDetailsEntity;
import com.timesheet.details.model.WorksheetDetails;
import com.timesheet.details.service.WorksheetDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/worksheet/details")
public class WorksheetDetailsController {

    @Autowired
    private WorksheetDetailsService worksheetDetailsService;

    @GetMapping("/{wsdetailsId}")
    public ResponseEntity<WorksheetDetails> getWorksheetDetails(@PathVariable("wsdetailsId") Integer wsdetailsId) {
        WorksheetDetails worksheetDetails = new WorksheetDetails(worksheetDetailsService.getWorksheetDetails(wsdetailsId).get());
        return new ResponseEntity<>(worksheetDetails, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<WorksheetDetails>> getAllWorksheets() {
        List<WorksheetDetails> worksheetDetailsList = new ArrayList<>();
        worksheetDetailsService.list().forEach(s -> worksheetDetailsList.add(new WorksheetDetails(s)));
        return new ResponseEntity<>(worksheetDetailsList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<WorksheetDetails> addWorksheetDetails(@RequestBody WorksheetDetailsEntity worksheetDetailsEntity) {
        WorksheetDetails worksheetDetails = new WorksheetDetails(worksheetDetailsService.addWorksheetDetails(worksheetDetailsEntity));
        return new ResponseEntity<>(worksheetDetails, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<WorksheetDetails> updateWorksheetDetails(@RequestBody WorksheetDetailsEntity worksheetDetailsEntity) {
        WorksheetDetails worksheetDetails = new WorksheetDetails(worksheetDetailsService.updateWorksheetDetails(worksheetDetailsEntity));
        return new ResponseEntity<>(worksheetDetails, HttpStatus.OK);
    }

    @DeleteMapping("/{wsdetailsId}")
    public ResponseEntity deleteWorksheetDetails(@PathVariable("wsdetailsId") Integer wsdetailsId) {
        worksheetDetailsService.deleteByWorksheetDetailsId(wsdetailsId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteWorksheetDetails(@RequestBody WorksheetDetailsEntity worksheetDetailsEntity) {
        worksheetDetailsService.deleteWorksheetDetails(worksheetDetailsEntity);
        return new ResponseEntity(HttpStatus.OK);
    }

}
