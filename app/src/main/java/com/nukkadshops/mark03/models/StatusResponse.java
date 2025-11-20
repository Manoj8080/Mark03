package com.nukkadshops.mark03.models;

import java.util.List;
public class StatusResponse{
    public final int rc;
    public final String rm;
    public final long ptr;
    public final List<TransactionData> td;
    public static class TransactionData{
        public final String tag,val;
        public TransactionData(String t,String v){
            tag=t;
            val=v;
        }
    }
    public StatusResponse(int rc,String rm,long p,List<TransactionData> td){
        this.rc=rc;
        this.rm=rm;
        this.ptr=p;
        this.td=td;
    }
}