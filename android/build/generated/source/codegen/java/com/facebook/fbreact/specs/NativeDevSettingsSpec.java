
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
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeDevSettingsSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void reload();

  @ReactMethod
  @DoNotStrip
  public void reloadWithReason(String reason) {}

  @ReactMethod
  @DoNotStrip
  public void onFastRefresh() {}

  @ReactMethod
  @DoNotStrip
  public abstract void setHotLoadingEnabled(boolean isHotLoadingEnabled);

  @ReactMethod
  @DoNotStrip
  public abstract void setIsDebuggingRemotely(boolean isDebuggingRemotelyEnabled);

  @ReactMethod
  @DoNotStrip
  public abstract void setProfilingEnabled(boolean isProfilingEnabled);

  @ReactMethod
  @DoNotStrip
  public abstract void toggleElementInspector();

  @ReactMethod
  @DoNotStrip
  public abstract void addMenuItem(String title);

  @ReactMethod
  @DoNotStrip
  public abstract void addListener(String eventName);

  @ReactMethod
  @DoNotStrip
  public abstract void removeListeners(double count);

  @ReactMethod
  @DoNotStrip
  public abstract void setIsShakeToShowDevMenuEnabled(boolean enabled);
}
