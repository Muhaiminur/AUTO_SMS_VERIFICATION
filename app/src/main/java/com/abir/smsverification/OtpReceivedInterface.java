package com.abir.smsverification;

public interface OtpReceivedInterface {
    void onOtpReceived(String otp);

    void onOtpTimeout();
}
