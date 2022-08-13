
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeNetworkingAndroidSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void sendRequest(String method, String url, double requestId, ReadableArray headers, ReadableMap data, String responseType, boolean useIncrementalUpdates, double timeout, boolean withCredentials);

  @ReactMethod
  @DoNotStrip
  public abstract void abortRequest(double requestId);

  @ReactMethod
  @DoNotStrip
  public abstract void clearCookies(Callback callback);

  @ReactMethod
  @DoNotStrip
  public abstract void addListener(String eventName);

  @ReactMethod
  @DoNotStrip
  public abstract void removeListeners(double count);
}
