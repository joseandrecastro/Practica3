package com.example.joel.practica_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button boton = (Button) findViewById(R.id.button2);


        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent a = new Intent(this,MainActivity.class);
        //Inicia la actividad
        startActivity(a);
    }
}