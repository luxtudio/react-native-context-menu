package com.luxtudio.reactnativecontextmenu;

import android.graphics.Color;

import androidx.annotation.Nullable;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = ReactNativeContextMenuViewManager.NAME)
public class ReactNativeContextMenuViewManager extends ReactNativeContextMenuViewManagerSpec<ReactNativeContextMenuView> {

  public static final String NAME = "ReactNativeContextMenuView";

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public ReactNativeContextMenuView createViewInstance(ThemedReactContext context) {
    return new ReactNativeContextMenuView(context);
  }

  @Override
  @ReactProp(name = "color")
  public void setColor(ReactNativeContextMenuView view, @Nullable String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }
}
