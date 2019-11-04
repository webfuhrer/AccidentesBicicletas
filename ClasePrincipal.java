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
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Accidente> lista_accidentes=AccesoFichero.devolverAccidentes();
        String tabla_html=PintaHTML.crearTabla(lista_accidentes);
        String encabezado=PintaHTML.crearEncabezado();
        String pie=PintaHTML.crearPie();
        String html_total=encabezado+tabla_html+pie;
        AccesoFichero.grabarTabla(html_total);
    }
}
