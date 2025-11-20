package com.nukkadshops.mark03.models;
public class UploadRequest{
    public final String tn,apm,amt,uid,stk,sid;
    public final int sn,mid,cid,pc;
    public UploadRequest(String tn,int sn,String apm,String amt,String uid,int mid,String stk,String sid,int cid,int pc){
        this.tn=tn;
        this.sn=sn;
        this.apm=apm;
        this.amt=amt;
        this.uid=uid;
        this.mid=mid;
        this.stk=stk;
        this.sid=sid;
        this.cid=cid;
        this.pc=pc;
    }
}