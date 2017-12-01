package com.example.edgar_rangel.comarduinorc;

import com.example.edgar_rangel.comarduinorc.MVP_Mactivity.Presenter;
import com.example.edgar_rangel.comarduinorc.MVP_Mactivity.PresenterImpl;
import com.example.edgar_rangel.comarduinorc.MVP_Mactivity.View;
import com.example.edgar_rangel.comarduinorc.dagger.App;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View {
    @BindView(R.id.btnCMBLayout) Button cambioLayout;
    PresenterImpl implement;
    @Inject
    Presenter presenter;
    BluetoothSocket btSocket = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getComponent().inject(this);
        //Area to Make the Binding
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCMBLayout)
    @Override
    public void cambioConnection(View view) {
        Intent cambioConnections = new Intent(MainActivity.this, Connections.class);
        startActivity(cambioConnections);
    }

    @OnClick(R.id.Arriba)
    @Override
    public void btnArriba() {
        Toast.makeText(this, "Arriba", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("UP".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    @OnClick(R.id.Izq)
    @Override
    public void btnIzquierda() {
        Toast.makeText(this, "Izquierda", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("LEFT".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    @OnClick(R.id.Der)
    @Override
    public void btnDerecha() {
        Toast.makeText(this, "Derecha", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("RIGHT".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    @OnClick(R.id.Abajo)
    @Override
    public void btnAbajo() {
        Toast.makeText(this, "Abajo", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("DOWN".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    @Override
    public void resultArduino() {

    }

    @OnClick(R.id.btnOffLed)
    @Override
    public void OFFLed() {
        Toast.makeText(this, "Apagar LED", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("OFF".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    @OnClick(R.id.btnOnLed)
    @Override
    public void ONLed() {
        Toast.makeText(this, "Encender LED", Toast.LENGTH_SHORT).show();
        /*if(btSocket!=null){
            try {
                btSocket.getOutputStream().write("ON".toString().getBytes());
            } catch(Exception ex) {
                Toast.makeText(this, "Disculpa, no se ha establecido la conexion con Bluetooth", Toast.LENGTH_SHORT).show();
            }
        }*/
    }
}
