package com.example.mov_cup_america_2020_1061808480.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mov_cup_america_2020_1061808480.R;
import com.example.mov_cup_america_2020_1061808480.clases.itemEquipos;
import com.example.mov_cup_america_2020_1061808480.listaEquipos;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterOpciones extends RecyclerView.Adapter<AdapterOpciones.AdapterViewHolder>{
    private List<itemEquipos> listaDatos;
    private int resource;
    private Activity activity;

    public AdapterOpciones() {
    }

    public AdapterOpciones(List<itemEquipos> listaDatos, int resource, Activity activity) {
        this.listaDatos = listaDatos;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(resource,viewGroup,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder adapterViewHolder, int i) {
        itemEquipos itemModel = listaDatos.get(i);
        Picasso.get().load(itemModel.getImag()).into(adapterViewHolder.imagen1);
        Picasso.get().load(itemModel.getImag2()).into(adapterViewHolder.imagen1);
        adapterViewHolder.nombre1.setText(itemModel.nombreEquipo1());
        adapterViewHolder.nombre2.setText(itemModel.nombreEquipo2());
        adapterViewHolder.marca1.setText(""+itemModel.getMarcador());
        adapterViewHolder.marca2.setText(""+itemModel.getMarcador2());

    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen1, imagen2;
        TextView nombre1, marca1, marca2;
        TextView nombre2;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen1 = itemView.findViewById(R.id.image1);
            imagen2 = itemView.findViewById(R.id.image2);
            nombre1 = itemView.findViewById(R.id.EdtEquipo1);
            nombre2 = itemView.findViewById(R.id.EdtEquipo2);
            marca1 = itemView.findViewById(R.id.EdtMarcador1);
            marca2 = itemView.findViewById(R.id.EdtMarcado2);
        }
    }
}
