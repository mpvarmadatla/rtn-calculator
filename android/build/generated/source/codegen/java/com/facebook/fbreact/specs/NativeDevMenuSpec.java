
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

public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeDevMenuSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void show();

  @ReactMethod
  @DoNotStrip
  public abstract void reload();

  @ReactMethod
  @DoNotStrip
  public abstract void debugRemotely(boolean enableDebug);

  @ReactMethod
  @DoNotStrip
  public abstract void setProfilingEnabled(boolean enabled);

  @ReactMethod
  @DoNotStrip
  public abstract void setHotLoadingEnabled(boolean enabled);
}
