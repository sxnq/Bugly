package xunqaing.bwie.com.bugly_tosdcard.application;

import android.app.Application;

import xunqaing.bwie.com.bugly_tosdcard.crash.CrashHandler;

public class CrashApplication extends Application {
    @Override  
    public void onCreate() {  
        super.onCreate();  
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());  
    }  
}  