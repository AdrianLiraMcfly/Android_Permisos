package com.example.permisos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewholder>{

    public List<Permisos> permisos;

    public Adaptador(List<Permisos> permisos) {
        this.permisos = permisos;
    }

    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        Permisos permiso = permisos.get(position);
        holder.permiso.setText(permiso.getName());
        holder.permisogaranted.setChecked(permiso.isGranted());

        holder.permisogaranted.setOnClickListener((buttonView) -> {
            permiso.setGranted(!permiso.isGranted());
        });
    }

    @Override
    public int getItemCount() {
        return permisos.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder {
        public TextView permiso;
        public Switch permisogaranted;

        public viewholder(View itemView) {
            super(itemView);
            permiso = itemView.findViewById(R.id.tvName);
            permisogaranted = itemView.findViewById(R.id.switchper);
        }
    }
}
