package com.timesheet.details.exception;


public class ApplicationException extends RuntimeException {
    private String error;
    private String description;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicationException(String error, String description) {
        super(error);
        this.error = error;
        this.description = description;
    }

    public ApplicationException(String error) {
        super(error);
        this.error = error;
    }

    public ApplicationException() {
        super();
    }
}


