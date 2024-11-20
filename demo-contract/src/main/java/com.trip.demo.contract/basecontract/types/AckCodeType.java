package com.trip.demo.contract.basecontract.types;


public enum AckCodeType {
    Success(0),
    Failure(1),
    Warning(2),
    PartialFailure(3);
    private final int value;
    AckCodeType(int value)
    {
        this.value=value;
    }
    public int getValue(){
        return value;
    }

}
