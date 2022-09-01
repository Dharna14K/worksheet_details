package com.timesheet.details.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name="WORKSHEET")
@Data
public class WorksheetEntity {

    @Id
    @Column(name="WORKSHEET_ID")
    private Integer worksheetId;


    @Column(name="EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name="MONTH_VALUE")
    private Integer monthValue;


}

