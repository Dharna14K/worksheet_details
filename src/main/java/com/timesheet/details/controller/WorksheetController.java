package com.timesheet.details.controller;

import com.timesheet.details.entity.WorksheetEntity;
import com.timesheet.details.model.Worksheet;
import com.timesheet.details.service.WorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/worksheet")
public class WorksheetController {

    @Autowired
    private WorksheetService worksheetService;

    @GetMapping("/{worksheetId}")
    public ResponseEntity<Worksheet> getWorksheetDetails(@PathVariable("worksheetId") Integer worksheetId) {
        Worksheet worksheet = new Worksheet(worksheetService.getWorksheet(worksheetId).get());
        return new ResponseEntity<>(worksheet, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Worksheet>> getAllWorksheets() {
        List<Worksheet> worksheetList = new ArrayList<>();
        worksheetService.list().forEach(s -> worksheetList.add(new Worksheet(s)));
        return new ResponseEntity<List<Worksheet>>(worksheetList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Worksheet> addWorksheet(@RequestBody WorksheetEntity worksheetEntity) {
        Worksheet worksheet = new Worksheet(worksheetService.addWorksheet(worksheetEntity));
        return new ResponseEntity<>(worksheet, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Worksheet> updateWorksheet(@RequestBody WorksheetEntity worksheetEntity) {
        Worksheet worksheet = new Worksheet(worksheetService.updateWorksheet(worksheetEntity));
        return new ResponseEntity<>(worksheet, HttpStatus.OK);
    }

    @DeleteMapping("/{worksheetId}")
    public ResponseEntity deleteWorksheet(@PathVariable("worksheetId") Integer worksheetId) {
        worksheetService.deleteByWorksheetId(worksheetId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteWorksheet(@RequestBody WorksheetEntity worksheetEntity) {
        worksheetService.deleteWorksheet(worksheetEntity);
        return new ResponseEntity(HttpStatus.OK);
    }

}
