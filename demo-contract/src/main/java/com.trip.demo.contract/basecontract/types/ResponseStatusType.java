package com.trip.demo.contract.basecontract.types;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ResponseStatusType {

    public Calendar timestamp;

    public AckCodeType ack;

    public String build;

    public String version;

    public List<ErrorDataType> errors;

    public List<ExtensionType> extensions;
    public ResponseStatusType()
    {
        init();
    }
    public ResponseStatusType(Exception e)
    {
        init();
        errors=new ArrayList<ErrorDataType>();
        ErrorDataType errorDataType=new ErrorDataType(e);
        errors.add(errorDataType);
        ack=AckCodeType.Failure;
    }
    private void init(){
        timestamp=Calendar.getInstance();
        build=System.getProperty("service.build")==null?"000000":System.getProperty("service.build");
        version=System.getProperty("service.version")==null?"0.0.0.0":System.getProperty("service.version");
    }
    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public AckCodeType getAck() {
        return ack;
    }

    public void setAck(AckCodeType ack) {
        this.ack = ack;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ErrorDataType> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDataType> errors) {
        this.errors = errors;
    }

    public List<ExtensionType> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionType> extensions) {
        this.extensions = extensions;
    }
}
