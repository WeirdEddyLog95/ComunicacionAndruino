package com.example.edgar_rangel.comarduinorc.dagger;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

import android.app.Application;

import com.example.edgar_rangel.comarduinorc.MVP_Mactivity.PresenterModule;

public class App extends Application {
    private AppComponent appComponent;
    @Override
    public void onCreate(){
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .presenterModule(new PresenterModule())
                .build();
    }

    public AppComponent getComponent(){
        return appComponent;
    }
}
