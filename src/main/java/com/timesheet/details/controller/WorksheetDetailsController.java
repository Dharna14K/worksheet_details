package com.timesheet.details.controller;

import com.timesheet.details.model.Worksheet;
import com.timesheet.details.model.WorksheetDetails;
import com.timesheet.details.service.WorksheetDetailsService;
import com.timesheet.details.service.WorksheetService;
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
    public ResponseEntity<WorksheetDetails> addWorksheetDetails(@RequestBody WorksheetDetails worksheetDetails) {
        WorksheetDetails worksheetDetails1 = new WorksheetDetails(worksheetDetailsService.addWorksheetDetails(worksheetDetails));
        return new ResponseEntity<>(worksheetDetails1, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<WorksheetDetails> updateWorksheetDetails(@RequestBody WorksheetDetails worksheetDetails) {
        WorksheetDetails worksheetDetails1 = new WorksheetDetails(worksheetDetailsService.updateWorksheetDetails(worksheetDetails));
        return new ResponseEntity<>(worksheetDetails1, HttpStatus.OK);
    }

    @DeleteMapping("/{wsdetailsId}")
    public ResponseEntity deleteWorksheetDetails(@PathVariable("wsdetailsId") Integer wsdetailsId) {
        worksheetDetailsService.deleteByWorksheetDetailsId(wsdetailsId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteWorksheetDetails(@RequestBody WorksheetDetails worksheetDetails) {
        worksheetDetailsService.deleteWorksheetDetails(worksheetDetails);
        return new ResponseEntity(HttpStatus.OK);
    }

}
