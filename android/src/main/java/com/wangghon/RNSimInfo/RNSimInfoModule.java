
package com.wangghon.RNSimInfo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.telephony.TelephonyManager;

public class RNSimInfoModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSimInfoModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSimInfo";
  }


  @ReactMethod
  public void isSimCardValid(Callback callback) {

    TelephonyManager tm = (TelephonyManager) this.reactContext.getSystemService(Context.TELEPHONY_SERVICE);  //gets the current TelephonyManager
    Bool isSimCardValid = tm.getSimState() == TelephonyManager.SIM_STATE_READY);

    callback.invoke(isSimCardValid);
  }
}