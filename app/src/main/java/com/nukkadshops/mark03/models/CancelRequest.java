package com.nukkadshops.mark03.models;
public class CancelRequest{
    public final int mid,cid;
    public final String stk,sid,amt;
    public final long ptr;
    public final boolean c;
    public CancelRequest(int m,String s,String si,int c2,long p,String a,boolean c)
    {
        mid=m;
        stk=s;
        sid=si;
        cid=c2;
        ptr=p;
        amt=a;
        this.c=c;
    }
}