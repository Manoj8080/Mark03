package com.nukkadshops.mark03.models;
public class VoidRequest{
    public final String tn,apm,sid,amt,stk;
    public final int sn,mid,cid,pc,ver;
    public final long ptr;
    public VoidRequest(String t,int s,String a,String si,String am,int m,String st,int c,int p,long pr,int v){
        tn=t;
        sn=s;
        apm=a;
        sid=si;
        amt=am;
        mid=m;
        stk=st;
        cid=c;
        pc=p;
        ptr=pr;
        ver=v;
    }
}