package com.dev.simposio.ui;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.dev.simposio.R;
import com.dev.simposio.activities.CategoriaBio;
import com.dev.simposio.activities.CategoriaSalud;
import com.dev.simposio.activities.CategoriaTecnologia;
import com.dev.simposio.adapters.AdaptadorActividades;
import com.dev.simposio.modelo.Actividades;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Fragmento para la sección de "Inicio"
 */
public class FragmentoInicio extends Fragment
{
    CarouselView carouselView;
    int[] sampleImages={R.drawable.medico,R.drawable.semana,R.drawable.simposio,R.drawable.dia,R.drawable.upp,R.drawable.semanaterapia,R.drawable.biomed,R.drawable.uppsim};

    public FragmentoInicio()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragmento_inicio, container, false);

       // final ImageView imageView=(ImageView)view.findViewById(R.id.img_cambio);
        Button cat_tecnologia=(Button)view.findViewById(R.id.btn_Tecnologia);
        Button cat_salud=(Button)view.findViewById(R.id.btnSalud);
        Button cat_bio=(Button)view.findViewById(R.id.btnBio);

        carouselView = (CarouselView) view.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);
        cat_tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), CategoriaTecnologia.class);
                startActivity(intent);
            }
        });
        cat_salud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), CategoriaSalud.class);
                startActivity(intent);
            }
        });
        cat_bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), CategoriaBio.class);
                startActivity(intent);
            }
        });


        /*imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                {
                    AnimationDrawable animation = (AnimationDrawable) imageView.getDrawable();
                    animation.stop();
                    animation.selectDrawable(0);
                    animation.start();
                    return true;
                }

                return false;
            }
        });*/

        return view;
    }
    ImageListener imageListener=new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


}
