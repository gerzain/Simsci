package com.dev.simposio.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dev.simposio.R;

public class CategoriaSalud extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_salud);
        agregarToolbar();
        Button salud_dia_uno=(Button)findViewById(R.id.btndiauno_salud);
        Button salud_dia_dos=(Button)findViewById(R.id.btndiados_salud);
        Button salud_dia_tres=(Button)findViewById(R.id.btndiatres_salud);

        final  TextView des_salud_dia_uno=(TextView)findViewById(R.id.tv_des_saluduno);
        final TextView des_salud_dia_dos=(TextView)findViewById(R.id.tv_dia2_salud);
        final TextView des_salud_dis_tres=(TextView)findViewById(R.id.tv_dia3_salud);

        salud_dia_uno.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des_salud_dia_uno.setVisibility(View.VISIBLE);
                    des_salud_dia_dos.setVisibility(View.GONE);
                    des_salud_dis_tres.setVisibility(View.GONE);
                }

                return false;
            }
        });
        salud_dia_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        salud_dia_dos.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des_salud_dia_dos.setVisibility(View.VISIBLE);
                    des_salud_dia_uno.setVisibility(View.GONE);
                    des_salud_dis_tres.setVisibility(View.GONE);
                }


                return false;
            }
        });
        salud_dia_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        salud_dia_tres.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                if(motionEvent.getAction()==MotionEvent.ACTION_MOVE)
                {
                    des_salud_dis_tres.setVisibility(View.VISIBLE);
                    des_salud_dia_uno.setVisibility(View.GONE);
                    des_salud_dia_dos.setVisibility(View.GONE);
                }

                return false;
            }
        });
        salud_dia_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        des_salud_dia_dos.setVisibility(View.GONE);
        des_salud_dia_uno.setVisibility(View.GONE);
        des_salud_dis_tres.setVisibility(View.GONE);

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
