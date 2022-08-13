
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
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeAccessibilityInfoSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void isReduceMotionEnabled(Callback onSuccess);

  @ReactMethod
  @DoNotStrip
  public abstract void isTouchExplorationEnabled(Callback onSuccess);

  @ReactMethod
  @DoNotStrip
  public void isAccessibilityServiceEnabled(Callback onSuccess) {}

  @ReactMethod
  @DoNotStrip
  public abstract void setAccessibilityFocus(double reactTag);

  @ReactMethod
  @DoNotStrip
  public abstract void announceForAccessibility(String announcement);

  @ReactMethod
  @DoNotStrip
  public void getRecommendedTimeoutMillis(double mSec, Callback onSuccess) {}
}
