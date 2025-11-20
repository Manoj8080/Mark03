package com.nukkadshops.mark03.models;
public class CancelResponse
{
    public final int rc;
    public final String rm;
    public CancelResponse(int rc,String rm)
    {
        this.rc=rc;
        this.rm=rm;
    }
}