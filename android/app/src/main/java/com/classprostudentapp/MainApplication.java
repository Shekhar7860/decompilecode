package com.classprostudentapp;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.staltz.flagsecure.FlagSecurePackage;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        /* access modifiers changed from: protected */
        public String getJSMainModuleName() {
            return Param.INDEX;
        }

        public boolean getUseDeveloperSupport() {
            return false;
        }

        /* access modifiers changed from: protected */
        public List<ReactPackage> getPackages() {
            ArrayList packages = new PackageList((ReactNativeHost) this).getPackages();
            packages.add(new FlagSecurePackage());
            return packages;
        }
    };

    private static void initializeFlipper(Context context) {
    }

    public ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    public void onCreate() {
        super.onCreate();
        SoLoader.init((Context) this, false);
        initializeFlipper(this);
    }
}
