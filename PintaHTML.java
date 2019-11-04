/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobicicletas;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
class PintaHTML {

    static String crearTabla(ArrayList<Accidente> lista_accidentes) {
        String table="<table><tr><th>FECHA</th><th>HORA</th><th>DISTRITO</th><th>TIPO ACCIDENTE</th>"+
                "<th>TIPO PERSONA</th><th>RANGO EDAD</th><th>SEXO</th></tr>";
        //for-each
        for(Accidente a: lista_accidentes)
        {
            String sexo=a.getSexo();
            String color="";
            if(sexo.equals("Mujer"))
            {
                color="clase_mujer";
            }
            else
            {
                 color="clase_hombre";
            }
            
            table+="<tr><td>"+a.getFecha()+"</td><td>"+a.getHora()+"</td><td>"
                    +a.getDistrito()+"</td><td>"+a.getTipo_accidente()+"</td>"+
                    "<td>"+a.getTipo_persona()+"</td><td>"+a.getRango_edad()+"</td>"+
                    "<td class='"+color+"'>"+a.getSexo()+"</td></tr>";
            
        }
        //table=table+"</table>";
        table+="</table>";
          return table;
    }

    static String crearEncabezado() {
       String encabezado="<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"<style>"+

 ".clase_hombre{background-color: green; text-decoration: underline}"+        
 ".clase_mujer{color: white;background-color: blue; text-decoration: underline overline}"+ 
               "</style>"+
"<title>Accidentes en Madrid</title>\n" +
"</head>\n" +
"\n" +
"<body>";
       return encabezado;
    }

    static String crearPie() {
        String pie="</body></html>";
        return pie;
    }
    
}
