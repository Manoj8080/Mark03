package com.nukkadshops.mark03.models;
public class VoidResponse{
    public final int rc;
    public final String rm;
    public final long ptr;
    public final String info;
    public VoidResponse(int rc,String rm,long p,String i){
        this.rc=rc;
        this.rm=rm;
        this.ptr=p;
        this.info=i;
    }
}