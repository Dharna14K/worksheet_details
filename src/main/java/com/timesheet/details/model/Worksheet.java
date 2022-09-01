package com.timesheet.details.model;

public class Worksheet {

    private Integer worksheetId;

    private Integer employeeId;

    private Integer monthValue;

    public Worksheet(Worksheet worksheet) {
    }

    public Integer getWorksheetId() {
        return worksheetId;
    }

    public void setWorksheetId(Integer worksheetId) {
        this.worksheetId = worksheetId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(Integer monthValue) {
        this.monthValue = monthValue;
    }
}
