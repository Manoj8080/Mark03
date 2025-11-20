package com.nukkadshops.mark03.repository;

import com.nukkadshops.mark03.network.ApiClient;
import com.nukkadshops.mark03.network.ApiService;
import com.nukkadshops.mark03.sdk.PaymentConfig;
public class PaymentRepository {
    ApiService apiService;

    public PaymentRepository(PaymentConfig config) {
        ;
        apiService = ApiClient.getClient(config).create(ApiService.class);
    }

    public void upload(UploadRequest request, Callback<Upload>callback) {
        apiService.uploadResponseCall(request).enqueue(callback);
    }

    public void status(StatusRequest request, Callback<StatusResponse> callback) {
        apiService.statusResponseCall(request).enqueue(callback);
    }

    public void cancel(CancelRequest request, Callback<CancelResponse> callback) {
        apiService.cancelResponseCall(request).enqueue(callback);
    }
    public void voidTransaction(VoidRequest request, Callback<VoidResponse> callback) {
        apiService.voidResponseCall(request).enqueue(callback);
    }
}
