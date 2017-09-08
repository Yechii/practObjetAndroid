package com.example.dell.practobjet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class segundaactividad extends AppCompatActivity {
  Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactividad);

        final EditText txtUsurio = (EditText) findViewById(R.id.txtUsuario);
        final EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        final EditText txtTwitter = (EditText) findViewById(R.id.txtTwitter);
        final EditText txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        final EditText txtFecha = (EditText) findViewById(R.id.txtFecha);


       boton = (Button)findViewById(R.id.btnAceptar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pojos obj = new pojos(txtUsurio.getText().toString(),
                        txtEmail.getText().toString(),
                        txtTwitter.getText().toString(),
                        txtFecha.getText().toString(),
                        txtTelefono.getText().toString());
                Intent tn = new Intent();
                tn.putExtra("clave", obj);
                setResult(RESULT_OK, tn);
                finish();


            }
        });

    }
}
