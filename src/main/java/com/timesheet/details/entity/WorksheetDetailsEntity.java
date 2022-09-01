package com.timesheet.details.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "WORKSHEET_DETAILS")
public class WorksheetDetailsEntity {

    //WSDETAILS_ID, WORKSHEET_ID, WORK_STATUS, NO_OF_HOURS, PROJECT_CODE, DATE
    @Id
    @Column(name = "WSDETAILS_ID")
    private Integer wsdetailsId;

    @Column(name = "WORKSHEET_ID")
    private Integer worksheetId;

    @Column(name = "WORK_STATUS")
    private String workStatus;

    @Column(name = "NO_OF_HOURS")
    private Integer noOfHours;

    @Column(name = "PROJECT_CODE")
    private Integer projectCode;

    @Column(name = "DATE")
    private Date date;

}



