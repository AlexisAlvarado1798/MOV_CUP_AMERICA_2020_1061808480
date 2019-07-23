package com.example.mov_cup_america_2020_1061808480;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mov_cup_america_2020_1061808480.clases.Usuario;

public class registro extends AppCompatActivity {

    EditText edtNombre, edtApellido, edtCorreo, edtNumeroTelefono, edtContrasenia, edtRepetirContrasenia;
    Button btnRegistrar, btnCancelar;

    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        inicilizar();
    }

    private void inicilizar (){
        edtNombre = findViewById(R.id.EdtNombre);
        edtApellido = findViewById(R.id.EdtApellido);
        edtCorreo = findViewById(R.id.EdtCorreo);
        edtNumeroTelefono = findViewById(R.id.EdtTelefono);
        edtContrasenia = findViewById(R.id.EdtContrasenaRegistro);
        edtRepetirContrasenia = findViewById(R.id.EdtRepetirContrasenaRegistro);

        btnRegistrar = findViewById(R.id.BtnRegistrarse);
        btnCancelar = findViewById(R.id.BrnCancelar);

        usuario = new Usuario();

    }
}
