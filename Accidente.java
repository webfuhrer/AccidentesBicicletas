/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobicicletas;

/**
 *
 * @author CDMFP
 */
//POJO
//PLAIN OLD JAVA OBJECT
public class Accidente {
    private String fecha, hora, distrito, tipo_accidente, tipo_persona, rango_edad, sexo;

    public Accidente(String fecha, String hora, String distrito, String tipo_accidente, String tipo_persona, String rango_edad, String sexo) {
        this.fecha = fecha;
        this.hora = hora;
        this.distrito = distrito;
        this.tipo_accidente = tipo_accidente;
        this.tipo_persona = tipo_persona;
        this.rango_edad = rango_edad;
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTipo_accidente() {
        return tipo_accidente;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public String getRango_edad() {
        return rango_edad;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
}
