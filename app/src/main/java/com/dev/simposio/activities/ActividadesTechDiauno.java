package com.dev.simposio.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.dev.simposio.R;
import com.dev.simposio.adapters.AdaptadorActividades;
import com.dev.simposio.modelo.Actividades;

import java.util.ArrayList;
import java.util.List;

public class ActividadesTechDiauno extends AppCompatActivity {

    private List<Actividades> actividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_tech_diauno);
        agregarToolbar();
        initializeData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_actividad);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        AdaptadorActividades adapter=new AdaptadorActividades(actividades);
        recyclerView.setAdapter(adapter);

    }
    private void agregarToolbar()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null)
        {

            ab.setDisplayHomeAsUpEnabled(true);
        }

    }
    private void initializeData()
    {
        actividades=new ArrayList<>();
        actividades.add(new Actividades(R.drawable.semana,"Inaguración","20 Septiembre 2017","Auditorio"));
        actividades.add(new Actividades(R.drawable.semana,"Conferencia1","20 Septiembre 2017","Gota de Plata"));
        actividades.add(new Actividades(R.drawable.semana,"Conferencia2","20 Septiembre 2017","TuzoForum"));

    }

}
