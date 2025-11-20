package com.nukkadshops.mark03.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import com.nukkadshops.mark03.models.*;

public interface ApiService {

    @POST("api/upload")
    Call<UploadResponse> uploadResponseCall(@Body UploadRequest request);

    @POST("api/status")
    Call<StatusResponse> statusResponseCall(@Body StatusRequest request);

    @POST("api/force-cancel")
    Call<CancelResponse> cancelResponseCall(@Body CancelRequest request);

    @POST("api/void")
    Call<VoidResponse> voidResponseCall(@Body VoidRequest request);
}
