package com.example.mov_cup_america_2020_1061808480;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mov_cup_america_2020_1061808480.clases.itemEquipos;

import java.util.ArrayList;
import java.util.List;

public class listaEquipos extends AppCompatActivity {
    List<itemEquipos> listEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_equipos);

        listEquipos = new ArrayList<>();

    }

    public void llenarListaEquipos(){
        listEquipos.add(new itemEquipos("Colombia", "Brazil", 0,0,"http://is2.4chan.org/int/1562716523211.png", "https://ae01.alicdn.com/kf/HTB1Z.OQKXXXXXavXpXXq6xXFXXXJ/Columbia-nacional-bandera-nuevo-3x5ft-150x90-cm-Bandera-Nacional-del-poliester-1026-env-o-libre.jpg_640x640.jpg"));
        listEquipos.add(new itemEquipos("Ecuedor", "Venezuela", 0,0,"https://upload.wikimedia.org/wikipedia/commons/e/e8/Flag_of_Ecuador.svg", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png"));

    }
}
