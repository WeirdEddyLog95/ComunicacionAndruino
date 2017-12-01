package com.example.edgar_rangel.comarduinorc.dagger;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

import com.example.edgar_rangel.comarduinorc.MainActivity;
import com.example.edgar_rangel.comarduinorc.MVP_Mactivity.PresenterModule;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
