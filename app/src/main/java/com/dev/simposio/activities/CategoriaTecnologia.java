package com.dev.simposio.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dev.simposio.R;


public class CategoriaTecnologia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_tecnologia);
        agregarToolbar();
        Button diauno=(Button)findViewById(R.id.btndiauno);
        Button diados=(Button) findViewById(R.id.btnDiados);
        Button diatres=(Button)findViewById(R.id.btnDiatres);
        final TextView des=(TextView) findViewById(R.id.tv_descripcion_dia);
        final TextView des_dia_dos=(TextView)findViewById(R.id.tv_dia2_des);
        final TextView des_dia_tres=(TextView)findViewById(R.id.tv_dia3_ds);

        diauno.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {

                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des.setVisibility(View.VISIBLE);
                    des_dia_dos.setVisibility(View.GONE);
                    des_dia_tres.setVisibility(View.GONE);
                }

                return false;
            }
        });
        diauno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(CategoriaTecnologia.this,ActividadesTechDiauno.class);
                startActivity(intent);
            }
        });
        diados.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des_dia_dos.setVisibility(View.VISIBLE);
                    des.setVisibility(View.GONE);
                    des_dia_tres.setVisibility(View.GONE);
                }
                return false;
            }
        });
        diados.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(CategoriaTecnologia.this,DetailDiaDos.class);
                startActivity(intent);
            }
        });


        diatres.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des_dia_tres.setVisibility(View.VISIBLE);
                    des.setVisibility(View.GONE);
                    des_dia_dos.setVisibility(View.GONE);
                }

                return false;
            }
        });
        diatres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent=new Intent(CategoriaTecnologia.this,DetailDiaTres.class);
                startActivity(intent);
            }
        });
        des.setVisibility(View.GONE);
        des_dia_dos.setVisibility(View.GONE);
        des_dia_tres.setVisibility(View.GONE);


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


}
