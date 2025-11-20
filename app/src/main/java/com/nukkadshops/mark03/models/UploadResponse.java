package com.nukkadshops.mark03.models;
public class UploadResponse{
    public final int rc;
    public final String rm;
    public final long ptr;
    public UploadResponse(int rc,String rm,long ptr){
        this.rc=rc;
        this.rm=rm;
        this.ptr=ptr;
    }
}