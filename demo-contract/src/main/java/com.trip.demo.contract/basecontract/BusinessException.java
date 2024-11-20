package com.trip.demo.contract.basecontract;


public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 3152616724785436891L;
    private long exceptionCode;

    public long getExceptionCode() {
        return this.exceptionCode;
    }

    public void setExceptionCode(long exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }

    public BusinessException(Throwable throwable, String frdMessage) {
        super(throwable);
    }
}
