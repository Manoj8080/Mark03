package com.nukkadshops.mark03.sdk;

public enum PaymentState {
    IDLE,
    UPLOADING,
    POLLING,
    SUCCESS,
    FAILED,
    CANCELLED,
    TIMEOUT,
    ERROR;
}
