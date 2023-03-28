package com.luxtudio.reactnativecontextmenu;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.ReactNativeContextMenuViewManagerDelegate;
import com.facebook.react.viewmanagers.ReactNativeContextMenuViewManagerInterface;
import com.facebook.soloader.SoLoader;

public abstract class ReactNativeContextMenuViewManagerSpec<T extends View> extends SimpleViewManager<T> implements ReactNativeContextMenuViewManagerInterface<T> {
  static {
    if (BuildConfig.CODEGEN_MODULE_REGISTRATION != null) {
      SoLoader.loadLibrary(BuildConfig.CODEGEN_MODULE_REGISTRATION);
    }
  }

  private final ViewManagerDelegate<T> mDelegate;

  public ReactNativeContextMenuViewManagerSpec() {
    mDelegate = new ReactNativeContextMenuViewManagerDelegate(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<T> getDelegate() {
    return mDelegate;
  }
}
