package com.api.sgb.learnjava.exeptions;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter @Setter
public class ExceptionResponse implements Serializable {
    private Date timestemp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestemp, String message, String details) {
        this.timestemp = timestemp;
        this.message = message;
        this.details = details;
    }
}
