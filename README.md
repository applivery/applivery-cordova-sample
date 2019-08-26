# Applivery cordova sample

## Android config 

### Step 1
Add applivery dependency in `app/build.gradle`

```groovy
dependencies {
    implementation fileTree(dir: 'libs', include: '*.jar')
    // SUB-PROJECT DEPENDENCIES START
    implementation(project(path: ":CordovaLib"))
    // SUB-PROJECT DEPENDENCIES END

    implementation 'com.applivery:applvsdklib:x.x.x'
}
```

### Step 2
Init applivery in your _Application_ class with your `APPLIVERY_APP_TOKEN`

```java
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
```

### Step 3
Be sure that you added your _Application_ class in your `AndroidManifest.xml`

```xml
<application
    android:name=".AppliverySampleApplication"
    android:hardwareAccelerated="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:supportsRtl="true"
    tools:ignore="GoogleAppIndexingWarning">
```


# License
Copyright (C) 2019 Applivery

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.