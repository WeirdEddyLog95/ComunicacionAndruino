package com.example.edgar_rangel.comarduinorc.MVP_Connections;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

@Module
public class PresenterModule {
    @Provides
    public Presenter providePresenter(Model model){
        return new PresenterImpl(model);
    }
    @Provides
    public Model provideModel(){
        return new Model();
    }
}