
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
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeAccessibilityManagerSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentBoldTextState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentGrayscaleState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentInvertColorsState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentReduceMotionState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentReduceTransparencyState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void getCurrentVoiceOverState(Callback onSuccess, Callback onError);

  @ReactMethod
  @DoNotStrip
  public abstract void setAccessibilityContentSizeMultipliers(ReadableMap JSMultipliers);

  @ReactMethod
  @DoNotStrip
  public abstract void setAccessibilityFocus(double reactTag);

  @ReactMethod
  @DoNotStrip
  public abstract void announceForAccessibility(String announcement);

  @ReactMethod
  @DoNotStrip
  public void announceForAccessibilityWithOptions(String announcement, ReadableMap options) {}
}
