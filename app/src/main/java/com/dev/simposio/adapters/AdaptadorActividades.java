package com.dev.simposio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dev.simposio.R;
import com.dev.simposio.modelo.Actividades;

import java.util.List;

/**
 * Created by Irving on 08/04/2017.
 */

public class AdaptadorActividades extends RecyclerView.Adapter<AdaptadorActividades.ViewHolder>
{
    private List<Actividades> actividades;

    public AdaptadorActividades(List<Actividades> actividades)
    {
        this.actividades = actividades;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_actividad,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Actividades act=actividades.get(position);
        holder.nombre_actividad.setText(act.getDes());
        Glide.with(holder.itemView.getContext())
                .load(act.getImg())
                .centerCrop()
                .into(holder.img_actividad);
        holder.fecha.setText(act.getFecha());
        holder.lugar_actividad.setText(act.getLugar());
    }

    @Override
    public int getItemCount() {
        return actividades.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView nombre_actividad;
        public ImageView img_actividad;
        public TextView lugar_actividad;
        private TextView fecha;
        public ViewHolder(View itemView) {
            super(itemView);
            nombre_actividad=(TextView)itemView.findViewById(R.id.nombre_actividad);
            img_actividad=(ImageView) itemView.findViewById(R.id.imagen);
            lugar_actividad=(TextView)itemView.findViewById(R.id.lugar_actividad);
            fecha=(TextView)itemView.findViewById(R.id.fecha_actividad);
        }
    }

}
