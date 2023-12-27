package com.dailycoder.ccwc.validator;

import com.dailycoder.ccwc.advice.MethodNotSupportedExecption;
import com.dailycoder.ccwc.model.Constants;

import java.util.Arrays;

public class CCWCValidator {

    private boolean isValid = false;

    private static boolean isValidToolName(String toolName){
        return Constants.CCWC.equals(toolName);
    }

    private static boolean isParamSupported(String param){
        return Arrays.stream(Constants.SUPPORTED_PARAMS).anyMatch(x->x.equals(param));
    }

    public static boolean validate(String[] args) throws MethodNotSupportedExecption {
        if(isValidToolName(args[0]) && isParamSupported(args[1])){
            return true;
        }else {
            throw new MethodNotSupportedExecption("Method args not valid");
        }
    }



}
