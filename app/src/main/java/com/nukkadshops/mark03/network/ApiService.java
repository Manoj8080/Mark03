package com.nukkadshops.mark03.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class ApiService {
    @POST("api/upload")
    public Call<UploadResponse>uploadResponseCall(@Body UploadRequest request);
    @POST("api/status")
    public Call<StatusResponse>statusResponseCall(@Body StatusRequest request);
    @POST("api/forceCancel")
    public Call<CancelResponse>cancelResponseCall(@Body CancelRequest request);
    @POST("api/void")
    Call<VoidResponse>voidResponseCall(@Body VoidRequest request);
}
