package com.example.edgar_rangel.comarduinorc.MVP_Connections;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

public class PresenterImpl implements Presenter {
    //Se aplican los metodos que iniciamos en la clase Presentador
    private Model model;
    private View view;

    public PresenterImpl(Model model){
        this.model = model;
    }

    @Override
    public String cal(final String str){
        return str;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }
}