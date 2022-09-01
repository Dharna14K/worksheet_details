package com.timesheet.details.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorksheetDetails {

    //WSDETAILS_ID, WORKSHEET_ID, WORK_STATUS, NO_OF_HOURS, PROJECT_CODE, DATE
    private Integer wsdetailsId;
    private Integer worksheetId;
    private String workStatus;
    private Integer noOfHours;
    private Integer projectCode;
    private Date date;

    public WorksheetDetails(WorksheetDetails worksheetDetails) {
    }
}
