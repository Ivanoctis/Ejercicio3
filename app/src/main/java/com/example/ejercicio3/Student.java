package com.example.ejercicio3;

import java.io.Serializable;

public class Student implements Serializable {

    private String Nombre;
    private String LNP;
    private String LNM;
    private Integer No_cuenta;
    private Integer Genero;

    public void SetName(String _name){
        Nombre = _name;
    }

    public void SetLNP(String _lnp){
        LNP = _lnp;
    }

    public void SetLNM(String _lnm){
        LNM = _lnm;
    }

    public void SetNC(Integer _nocuenta){
        No_cuenta = _nocuenta;
    }

    public void SetG(Integer _genero){
        Genero = _genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLNP(){
        return LNP;
    }

    public String getLNM(){
        return LNM;
    }

    public Integer getNo_cuenta(){
        return No_cuenta;
    }

    public Integer getGenero(){
        return Genero;
    }

}
