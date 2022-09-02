package com.timesheet.details.model;

import com.timesheet.details.entity.WorksheetDetailsEntity;
import lombok.Data;

import java.util.Date;

@Data
public class WorksheetDetails {

    private String workStatus;
    private Integer noOfHours;
    private Integer projectCode;
    private Date date;

    public WorksheetDetails(WorksheetDetailsEntity worksheetDetails) {
        this.workStatus = worksheetDetails.getWorkStatus();
        this.noOfHours = worksheetDetails.getNoOfHours();
        this.projectCode = worksheetDetails.getProjectCode();
        this.date = worksheetDetails.getDate();
    }
}
