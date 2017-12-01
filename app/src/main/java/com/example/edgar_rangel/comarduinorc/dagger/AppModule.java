package com.example.edgar_rangel.comarduinorc.dagger;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

import android.app.Application;
import android.content.Context;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
