package com.timesheet.details.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity(name="WORKSHEET")
@Data
public class WorksheetEntity {

    @Id
    @Column(name="WORKSHEET_ID")
    private Integer worksheetId;

    @Column(name="EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name="MONTH_VALUE")
    private String monthValue;

    @OneToMany(mappedBy = "worksheetId")
    private List<WorksheetDetailsEntity> worksheetEntityList;

}

