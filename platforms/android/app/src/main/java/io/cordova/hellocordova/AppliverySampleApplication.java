package io.cordova.hellocordova;

import android.app.Application;
import com.applivery.applvsdklib.Applivery;

public class AppliverySampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    initApplivery();
  }

  private void initApplivery() {
    Applivery.init(this, BuildConfig.APPLIVERY_APP_TOKEN, false);
    Applivery.setCheckForUpdatesBackground(true);
    Applivery.enableShakeFeedback();
    Applivery.enableScreenshotFeedback();
  }
}
