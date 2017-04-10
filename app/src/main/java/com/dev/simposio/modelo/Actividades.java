package com.dev.simposio.modelo;

/**
 * Created by Irving on 08/04/2017.
 */

public class Actividades
{
    private int id;
    private String des;
    private String fecha;
    private String lugar;

    public Actividades(int id, String des,String date,String lugar) {
        this.id = id;
        this.des = des;
        this.fecha=date;
        this.lugar=lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public Actividades setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public int getImg()
    {
        return id;
    }

    public void setNombre(int id)
    {
        this.id = id;

    }

    public String getDes()
    {
        return des;
    }

    public void  setDes(String des)
    {
        this.des = des;
    }
}
