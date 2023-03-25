package com.smburu.modelmappers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistsException  extends  RuntimeException{
    public String message;
    public EmailAlreadyExistsException(String message){
        super(message);
    }

}
