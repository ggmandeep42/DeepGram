package com.example.deepgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qq7FuiXl9xBmCeUW4sWrw9ftysRt8Vep4IhE5y1y")
                .clientKey("bcFRbdNYGa635MomdqdOzDgfdWmYk3gXU2q4CwIE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
