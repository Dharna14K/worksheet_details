package com.timesheet.details.model;

import com.timesheet.details.entity.WorksheetEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Worksheet {

    private Integer worksheetId;

    private Integer employeeId;

    private String monthValue;

    private List<WorksheetDetails> workSheetDetails;

    public Worksheet(WorksheetEntity worksheetEntity) {
        this.worksheetId = worksheetEntity.getWorksheetId();
        this.employeeId = worksheetEntity.getEmployeeId();
        this.monthValue = worksheetEntity.getMonthValue();
        this.workSheetDetails = new ArrayList<>();
        worksheetEntity.getWorksheetEntityList().forEach(s -> this.workSheetDetails.add(new WorksheetDetails(s)));
    }
}
