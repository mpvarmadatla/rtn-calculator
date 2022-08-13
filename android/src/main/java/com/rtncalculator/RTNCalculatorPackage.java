package com.RTNCalculator;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicatonContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.TurboReactPackage;

import java.util.Collections;
import java.util.List;


public class CalculatorPackage extends TurboReactPackage{

    @Nullable
    @Override
    public NativeModule getModule(String name,ReactApplicatonContext reactContext){
        return null;
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProveder(){
        return null;
    }
}