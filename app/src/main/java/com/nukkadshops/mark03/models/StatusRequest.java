package com.nukkadshops.mark03.models;
public class StatusRequest{
    public final int mid,cid;
    public final String stk,sid;
    public final long ptr;
    public StatusRequest(int m,String s,String si,int c,long p){
        mid=m;
        stk=s;
        sid=si;
        cid=c;
        ptr=p;
    }
}