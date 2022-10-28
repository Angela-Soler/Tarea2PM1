package com.finsol.tarea2pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ActivityDatos extends AppCompatActivity {
    //Declaracion de Variables
    TextView txtNombre, txtApellido, txtEdad, txtCorreo;

    @SuppressLint({"WrongViewCast", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        txtNombre = findViewById(R.id.txtNombre_ad);
        txtApellido = findViewById(R.id.txtApellido_ad);
        txtEdad = findViewById(R.id.txtEdad_ad);
        txtCorreo = findViewById(R.id.txtCorreo_ad);

        Toast.makeText(ActivityDatos.this, "Datos Recibidos...",Toast.LENGTH_SHORT).show();
        Bundle Resultado = getIntent().getExtras();
        txtNombre.setText("Nombre: "+Resultado.getString("nombre"));
        txtApellido.setText("Apellido: "+Resultado.getString("apellido"));
        txtEdad.setText("Edad: "+Resultado.getString("edad"));
        txtCorreo.setText("Correo: "+Resultado.getString("correo"));
    }
}