package com.nukkadshops.mark03.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.nukkadshops.mark03.models.VoidRequest;
import com.nukkadshops.mark03.models.VoidResponse;
import com.nukkadshops.mark03.repository.PaymentRepository;
import com.nukkadshops.mark03.sdk.PaymentConfig;
import com.nukkadshops.mark03.sdk.VoidState;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VoidViewModel extends ViewModel {
    public MutableLiveData<VoidState>state=new MutableLiveData<>(VoidState.IDLE);
    PaymentRepository repo;
    public VoidViewModel(PaymentConfig c){repo=new PaymentRepository(c);
    }
    public void voidTx(VoidRequest r){
        state.setValue(VoidState.PROCESSING);
        repo.voidTransaction(r,new Callback<VoidResponse>(){
            public void onResponse(Call<VoidResponse> c, Response<VoidResponse> r){
                state.setValue(VoidState.APPROVED);
            }
            public void onFailure(Call<VoidResponse>c,Throwable t){
                state.setValue(VoidState.ERROR);
            }
        });
    }
}