package com.abir.smsverification;

import android.app.Application;

public class SMSCHECK extends Application {
    @Override public void onCreate() {
        super.onCreate();
        AppSignatureHelper appSignatureHelper = new AppSignatureHelper(this);
        appSignatureHelper.getAppSignatures();
    }
}
