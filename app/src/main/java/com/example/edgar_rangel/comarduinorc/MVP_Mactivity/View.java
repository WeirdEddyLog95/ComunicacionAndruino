package com.example.edgar_rangel.comarduinorc.MVP_Mactivity;

/**
 * Created by Edgar_Rangel on 11/26/2017.
 */

public interface View {
    /*Los metodos con los que se trabaja en la vista del Main Activity*/
    //Transicion de cambio a otro layout
    void cambioConnection(View view);
    //Los botones de direcciones para el coche
    void btnArriba();
    void btnIzquierda();
    void btnDerecha();
    void btnAbajo();
    //Cuando empieza el Arduino enviar mensajes de vuelta al telefono
    void resultArduino();
    //Para encender y apagar el LED
    void OFFLed();
    void ONLed();
}