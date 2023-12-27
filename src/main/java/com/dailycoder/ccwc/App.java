package com.dailycoder.ccwc;


import com.dailycoder.ccwc.advice.MethodNotSupportedExecption;
import com.dailycoder.ccwc.validator.CCWCValidator;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class App {

    private static Logger logger = Logger.getLogger(this.getClass().getName());

    public static void main(String[] args) throws MethodNotSupportedExecption  {

        try {
            CCWCValidator.validate(args)
        }
        catch (MethodNotSupportedExecption execption){
            logger.log();
        }e


    }
}
