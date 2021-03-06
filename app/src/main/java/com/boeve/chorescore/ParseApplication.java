package com.boeve.chorescore;

import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();

    Parse.enableLocalDatastore(this);
    Parse.initialize(this, getApplicationContext().getString(R.string.appId), getApplicationContext().getString(R.string.clientKey));
  }
}