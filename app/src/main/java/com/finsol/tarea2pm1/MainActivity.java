package com.finsol.tarea2pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables
    EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ActivityDatos.class);
                intent.putExtra("nombre",txtNombre.getText().toString());
                intent.putExtra("apellido",txtApellido.getText().toString());
                intent.putExtra("edad",txtEdad.getText().toString());
                intent.putExtra("correo",txtCorreo.getText().toString());
                startActivity(intent);
            }
        });

    }
}