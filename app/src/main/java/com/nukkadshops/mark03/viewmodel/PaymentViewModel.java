package com.nukkadshops.mark03.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.nukkadshops.mark03.models.UploadRequest;
import com.nukkadshops.mark03.models.UploadResponse;
import com.nukkadshops.mark03.repository.PaymentRepository;
import com.nukkadshops.mark03.sdk.PaymentConfig;
import com.nukkadshops.mark03.sdk.PaymentMode;
import com.nukkadshops.mark03.sdk.PaymentState;

public class PaymentViewModel extends ViewModel {
    public MutableLiveData<PaymentState> state=new MutableLiveData<>(PaymentState.IDLE);
    public MutableLiveData<Long>ptr=new MutableLiveData<>(0L);
    PaymentRepository repo;
    PaymentConfig cfg;
    public PaymentViewModel(PaymentConfig c){
        cfg=c;
        repo=new PaymentRepository(c);
    }
    public void startPayment(String amt, PaymentMode m, String txn){
        state.setValue(PaymentState.UPLOADING);
        UploadRequest r=new UploadRequest(txn,1,m.getCode(),amt,cfg.getUserId(),cfg.getMerchantId(),cfg.getSecurityToken(),cfg.getStoreId(),cfg.getClientId(),5);
        repo.upload(r,new retrofit2.Callback<UploadResponse>(){
            public void onResponse(retrofit2.Call<UploadResponse>c,retrofit2.Response<UploadResponse>r){
                if(r.body()!=null)
                    ptr.setValue(r.body().ptr);
            }
            public void onFailure(retrofit2.Call<UploadResponse>c,Throwable t){
                state.setValue(PaymentState.ERROR);
            }
        });
    }
}