package com.trip.demo.contract.basecontract.types;

import com.google.common.base.Throwables;
import com.trip.demo.contract.basecontract.BusinessException;
import org.springframework.util.StringUtils;


public class ErrorDataType {

    public String message;

    public long errorCode;

    public String stackTrace;

    public ErrorDataType()
    {}
    public ErrorDataType(Exception e)
    {
        message=e.getMessage();
        if (e.getClass().getSuperclass().getName().equals(BusinessException.class.getName()))
//        if ((BusinessException.class).isInstance(e.getClass().getSuperclass()))
        {
            errorCode=((BusinessException)e).getExceptionCode();
        }else {
            errorCode=10000;
        }
        String trackerror=System.getProperty("service.trackerror");
        boolean isTrack= (!StringUtils.hasLength(trackerror))&&trackerror.toLowerCase().equals("true")?true:false;
        if(e.getStackTrace()!=null&&isTrack)
            stackTrace= Throwables.getStackTraceAsString (e) ;
    }
}
